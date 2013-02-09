from flask import Flask
from flask_peewee.rest import RestAPI

import models

app = Flask(__name__)

# instantiate our api wrapper
api = RestAPI(app)

# register our models so they are exposed via /api/<model>/
api.register(models.Article)

# configure the urls
api.setup()

if __name__ == '__main__':
    app.run(debug=True)

