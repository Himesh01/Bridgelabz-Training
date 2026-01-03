package com.linkelist.moviemanagement;

public class DoubleLinkList {
Movie head ;
    
    public void add(String title, String director, String year,float rating) {
    	Movie movie = new Movie(title,director,year,rating);
    	if(head==null) {
    		head = movie;
    		System.out.println("Movie added successfully : "+movie.movieTitle);
        	return;
    	}
    	
    	Movie cur = head;
    	while(cur.next!=null) {
    		cur = cur.next;
    	}
    	movie.perv = cur;
    	cur.next= movie;
    	System.out.println("Movie added successfully : "+movie.movieTitle);
    	return;
    }
    public void addAtPosition(String title,String director,String year, float rating,int idx) {
    	Movie movie = new Movie(title,director,year,rating);
    	if(idx==0&&head==null) {
    		head = movie;
    		System.out.println("Movie added SuccessFully : "+movie.movieTitle);
    		return;
    	}
    	int i =0;
       Movie cur = head;
       while(cur!=null) {
    	   if(idx==i) {
    		   if(cur.perv==null) {
    			   movie.next = cur;
    			   cur.perv = movie;
    		   }else {
    			   movie.perv = cur.perv;
    			   movie.next = cur;
    			   cur.perv = movie;
    		   }
    		   return;
    	   }
    	   i++;
    	   cur = cur.next;
       }
       System.out.println("Student not found !");
    }
    public void search(String director) {
    	Movie cur = head;
    	while(cur!=null) {
    		if(cur.director.equalsIgnoreCase(director)) {
    			System.out.println(" ");
    			System.out.println("----------Movie Details------------");
    			System.out.println("Title           : "+cur.movieTitle);
    			System.out.println("Director        : "+cur.director);
    			System.out.println("Year of release : "+cur.yor);
    			System.out.println("Rating          : "+cur.rating);
    		}
    		cur = cur.next;
    	}
    }
    public void display() {
    	Movie cur = head;
    	    System.out.println("Movie Details ");
    	while(cur!=null) {
    			System.out.println(" ");
    			System.out.println("----------Movie Details------------");
    			System.out.println("Title           : "+cur.movieTitle);
    			System.out.println("Director        : "+cur.director);
    			System.out.println("Year of release : "+cur.yor);
    			System.out.println("Rating          : "+cur.rating);
    		cur = cur.next;
    	}
    	   
    }
    public void updateRating(String title,float rating) {
    	Movie cur = head;
    	while(cur!=null) {
    		if(cur.movieTitle.equalsIgnoreCase(title)) {
    			cur.rating = rating;
    			return;
    		}
    		cur = cur.next;
    	}
    	System.out.println("Movie not found ");
    }
}
