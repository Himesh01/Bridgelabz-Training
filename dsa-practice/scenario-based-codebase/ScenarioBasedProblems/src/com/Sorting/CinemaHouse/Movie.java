package com.Sorting.CinemaHouse;

public class Movie {
	String title;
	int showTime;
	
	public Movie(String title, int showTime) {
		this.title = title;
		this.showTime  = showTime;
	}
	@Override
	public String toString() {
		return String.format("[%04d] - %s", showTime, title);
	}
}
