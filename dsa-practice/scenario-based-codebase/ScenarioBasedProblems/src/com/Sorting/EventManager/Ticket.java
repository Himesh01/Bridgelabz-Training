package com.Sorting.EventManager;

public class Ticket {
	
    int ticketId;
    double price;

    public Ticket(int ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
    }

    public void display() {
        System.out.println("Ticket ID: " + ticketId + " | Price: ₹" + price);
    }
}
