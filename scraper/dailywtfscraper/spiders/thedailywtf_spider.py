from scrapy.spider import BaseSpider
from scrapy.selector import HtmlXPathSelector

from dailywtfscraper import items

from api import models    


class DmozSpider(BaseSpider):
    name = "thedailywtf"
    allowed_domains = ["thedailywtf.com"]
    start_urls = [
        "http://thedailywtf.com/Articles/" # Current month
    ]

    def parse(self, response):
        hxs = HtmlXPathSelector(response)
        
        article_containers = hxs.select('//div[@class="Home_ArticleSummaryContainer"]')

        articles = []
        for c in article_containers:
            article = items.DailyWFTArticleItem()
            article['title'] = c.select('.//a[contains(@id, "ArticleHyperLink")]/text()').extract()[0]
            article['link'] = c.select('.//a[contains(@id, "ArticleHyperLink")]/@href').extract()[0]
            article['description'] = c.select('.//div[contains(@class, "ArticleBody")]/text()').extract()[0]
            article['date'] = c.select('.//span[contains(@class, "Date")]/text()').extract()[0]
            article['author_name'] = c.select('.//div[contains(@class, "ArticleAuthor")]/a/text()').extract()[0]
            article['author_link'] = c.select('.//div[contains(@class, "ArticleAuthor")]/a/@href').extract()[0]
            article['comments_total'] = int(c.select('.//div[contains(@class, "ArticleFooter")]/a[1]/text()').extract()[0].split()[0])
            article['comments_link'] = c.select('.//div[contains(@class, "ArticleFooter")]/a[1]/@href').extract()[0]
            article['comments_latest_link'] = c.select('.//div[contains(@class, "ArticleFooter")]/a[2]/@href').extract()[0]
     
            try:
                article['time'] = c.select('.//div[contains(@class, "ArticleFooter")]/b/text()').extract()[0]
            except IndexError:
                article['time'] = ''

            # save to db
            models.Article.create(**article)

            articles.append(article)

        return articles