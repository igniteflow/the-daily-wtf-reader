# Scrapy settings for dailywtfscraper project
#
# For simplicity, this file contains only the most important settings by
# default. All the other settings are documented here:
#
#     http://doc.scrapy.org/topics/settings.html
#

BOT_NAME = 'dailywtfscraper'

SPIDER_MODULES = ['dailywtfscraper.spiders']
NEWSPIDER_MODULE = 'dailywtfscraper.spiders'

# Crawl responsibly by identifying yourself (and your website) on the user-agent
USER_AGENT = 'dailywtfscraper (+http://www.igniteflow.com)'
