package com.linkelist.moviemanagement;

public class Main {
	 public static void main(String[] args) {
    	 DoubleLinkList list = new DoubleLinkList();
    	 list.add("Dhurandhar ","Himesh","2003", 4.5f);
    	 list.add("Dhanak ","Rajeev","2025", 3.5f);
    	 list.display();
    	 list.updateRating("Dhanak ", 4.5f);
    	 list.display();
    	 
     }
}
