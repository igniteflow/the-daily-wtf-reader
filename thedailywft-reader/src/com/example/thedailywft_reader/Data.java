package com.example.thedailywft_reader;

import java.util.List;

public class Data {

	public Meta meta;
	public List<Article> objects;

	@Override
	public String toString() {
		return "Data [meta=" + meta + ", objects=" + objects + "]";
	}

	public List<Article> getObjects() {
		return objects;
	}

	public void setObjects(List<Article> objects) {
		this.objects = objects;
	}

	public class Meta {

		public String model;
		public String next;
		public int page;
		public String previous;

		@Override
		public String toString() {
			return "Meta [model=" + model + ", next=" + next + ", page=" + page
					+ ", previous=" + previous + "]";
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getNext() {
			return next;
		}

		public void setNext(String next) {
			this.next = next;
		}

		public int getPage() {
			return page;
		}

		public void setPage(int page) {
			this.page = page;
		}

		public String getPrevious() {
			return previous;
		}

		public void setPrevious(String previous) {
			this.previous = previous;
		}

	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}
}
