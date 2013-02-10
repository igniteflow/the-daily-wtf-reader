package com.example.thedailywft_reader;

import java.io.Serializable;

public class Article implements Serializable {

	public String title = null;
	public String link;
	public String description;
	public String date;
	public String author_name;
	public String author_link;
	public String comments_total;
	public String comments_link;
	public String comments_latest_link;
	public String time;
	public int id;

	@Override
	public String toString() {
		return "Article [title=" + title + ", link=" + link + ", description="
				+ description + ", date=" + date + ", author_name="
				+ author_name + ", author_link=" + author_link
				+ ", comments_total=" + comments_total + ", comments_link="
				+ comments_link + ", comments_latest_link="
				+ comments_latest_link + ", time=" + time + ", id=" + id + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getAuthor_link() {
		return author_link;
	}

	public void setAuthor_link(String author_link) {
		this.author_link = author_link;
	}

	public String getComments_total() {
		return comments_total;
	}

	public void setComments_total(String comments_total) {
		this.comments_total = comments_total;
	}

	public String getComments_link() {
		return comments_link;
	}

	public void setComments_link(String comments_link) {
		this.comments_link = comments_link;
	}

	public String getComments_latest_link() {
		return comments_latest_link;
	}

	public void setComments_latest_link(String comments_latest_link) {
		this.comments_latest_link = comments_latest_link;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
