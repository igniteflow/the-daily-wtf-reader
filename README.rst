THE DAILY WTF (UNOFFICIAL) READER
=================================


A simple reader application for thedailywtf.com.  Consists of:


1. Scraper (scrapy)
2. Restful API (flask-peewee)
3. Client apps (to come)


Setup
-----

(1) Create the file api/settings.py and add your database config::

	# make sure you've created your database
	DATABASE = {
	    'name': 'dailywtf-reader', 
		'user': 'thedailywtf',
		'password': 'thedailywtf',
	}

(2) Create the Article db table::

	python setup_db.py

(3) Add the project directory to your PYTHONPATH::

	cd [PROJECT_ROOT]
	export PYTHONPATH=$PYTHONPATH:.


Getting started
---------------

Run the scraper to populate the database::

	cd [PROJECT_ROOT]/scraper
	scrapy crawl thedailywtf

Start the http server and test::

	cd [PROJECT_ROOT]/api
	python app.py

In another terminal::

	curl http://127.0.0.1:5000/api/article/
