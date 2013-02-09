from scrapy.item import Item, Field

class DailyWFTArticleItem(Item):
    title = Field()
    link = Field()
    description = Field()
    date = Field()
    author_name = Field()
    author_link = Field()
    comments_total = Field()
    comments_link = Field()
    comments_latest_link = Field()
    time = Field()