from peewee import (MySQLDatabase, Model, CharField)

from settings import DATABASE


db = MySQLDatabase(DATABASE['name'], user=DATABASE['user'], passwd=DATABASE['password'])

class Article(Model):
    title = CharField()
    link = CharField()
    description = CharField()
    date = CharField()
    author_name = CharField()
    author_link = CharField()
    comments_total = CharField()
    comments_link = CharField()
    comments_latest_link = CharField()
    time = CharField()

    class Meta:
        database = db

