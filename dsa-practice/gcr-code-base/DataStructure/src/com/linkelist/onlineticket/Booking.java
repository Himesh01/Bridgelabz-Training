package com.linkelist.onlineticket;

public class Booking {
	Ticket head;
    
    public void add(Ticket t) {
  	  if(head == null) {
  		  head = t;
  		  t.next = head;
  		  System.out.println("SuccessFully booked ticket for "+t.movieName);
  		  return;
  	  }
  	  Ticket cur = head;
  	  while(cur.next!=head) {
  		  cur = cur.next;
  	  }
  	  cur.next = t;
  	  t.perv = cur;
  	  t.next = head;
  	  head.perv = t;
  	  head = t;
  	  System.out.println("Successfully booked ticket for "+t.movieName);
    }
    
    public void delete(long id) {
  	  if(head==null) {
  		  System.out.println("List is empty");
  		  return;
  	  }
  	  Ticket cur = head;
  	  while(cur.next!=head) {
  		  if(cur.ticketId==id) {
  			  Ticket t = cur.perv;
  			  t.next = cur.next;
  			  cur.next.perv = t;
  			  head = cur.perv;
  			  System.out.println("Successfully deleted booking of "+cur.movieName);
  			  return;
  		  }
  		  cur = cur.next;
  	  }
  	  if(cur.ticketId==id) {
  		  if(cur.perv!=head) {
			  Ticket t = cur.perv;
			  t.next = cur.next;
			  cur.next.perv = t;
			  head = cur.perv;
			  System.out.println("Successfully deleted booking of "+cur.movieName);
			  return;}else {
				  head=null;
			  }
		  }
  	  System.out.println("The ticket id not found");
    }
    public void currentTicket() {
  	  if(head == null) {
  		  System.out.println("List is empty ");
  		  return;
  	  }
  	  System.out.println("\n ---------List Details-----------");
  	  System.out.println("Ticket Id          : "+head.ticketId);
  	  System.out.println("Customer Name      : "+head.customerName);
  	  System.out.println("Movie Name         : "+head.movieName);
  	  System.out.println("Booking Time       : "+head.time);
  	  
    }
    public void search(String movie) {
  	  if(head==null) {
  		  System.out.println("List is empty");
  		  return;
  	  }
  	  Ticket cur = head;
  	  while(cur.next!=head) {
  		  if(cur.movieName.equalsIgnoreCase(movie)) {
  			  System.out.println("\n ---------List Details-----------");
  	    	  System.out.println("Ticket Id          : "+cur.ticketId);
  	    	  System.out.println("Customer Name      : "+cur.customerName);
  	    	  System.out.println("Movie Name         : "+cur.movieName);
  	    	  System.out.println("Booking Time       : "+cur.time);
  			  return;
  		  }
  		  cur = cur.next;
  	  }
  	  if(cur.movieName.equalsIgnoreCase(movie)) {
  		  System.out.println("\n ---------List Details-----------");
      	  System.out.println("Ticket Id          : "+head.ticketId);
      	  System.out.println("Customer Name      : "+head.customerName);
      	  System.out.println("Movie Name         : "+head.movieName);
      	  System.out.println("Booking Time       : "+head.time);
			  return;
		  }
  	  System.out.println("The ticket id not found");
    }
    public void totalAmount() {
  	  Ticket t = head;
  	  int count = 1;
  	  if(head==null) {
  		  System.out.println("Total amount : 0");
  		  return;
  	  }
  	  while(t.next!=head) {
  		  count++;
  		  t= t.next;
  	  }
  	  System.out.println("Total amount : "+(count*800));
    }
}
