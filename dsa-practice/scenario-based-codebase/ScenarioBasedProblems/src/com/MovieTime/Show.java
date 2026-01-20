package com.MovieTime;

import java.time.LocalTime;

public class Show {

	public String name;
	public LocalTime showTime;
	
	public Show(String name, String time) {
		this.name = name;
		showTime = LocalTime.parse(time);
	}
}