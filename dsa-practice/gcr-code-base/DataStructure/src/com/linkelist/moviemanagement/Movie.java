package com.linkelist.moviemanagement;

public class Movie {
	 Movie perv;
	 String movieTitle;
     String director;
     String yor;
     float rating;
     Movie next;
    
     public Movie(String movieTitle, String director, String yor, float rating) {
 		this.movieTitle = movieTitle;
 		this.director = director;
 		this.yor = yor;
 		this.rating = rating;
 		this.perv = null;
 		this.next = null;
 	}
}
