package com.artexpo;

import java.time.LocalDateTime;

public class Artist {

	public String name;
	public LocalDateTime registrationTime;
	
	public Artist(String name, String registrationTime) {
		this.name = name;
		LocalDateTime temp = LocalDateTime.parse(registrationTime);
		this.registrationTime = temp;
	}
}
