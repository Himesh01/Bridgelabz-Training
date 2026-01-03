package com.linkelist.onlineticket;

import java.time.LocalDate;

public class Ticket {
	   Ticket perv;
       long ticketId;
       String customerName;
       String movieName;
       int seatNo;
       LocalDate time;
       Ticket next;
	  
       
       public Ticket(long ticketId, String customerName, String movieName, int seatNo, LocalDate time) {
    	   this.ticketId = ticketId;
    	   this.customerName = customerName;
    	   this.movieName = movieName;
    	   this.seatNo = seatNo;
    	   this.time = time;
    	   this.perv = null;
    	   this.next = null;
       } 
}