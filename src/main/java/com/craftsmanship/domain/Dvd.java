package com.craftsmanship.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Dvd {

	private String title;
	private LocalDateTime date;

	public Dvd(String title, LocalDateTime date) {
		super();
		this.title = title;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Dvd [title=" + title + ", date=" + date + "]";
	}

}
