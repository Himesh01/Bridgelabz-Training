package com.TreeGraph.OnlineTicketBookingSystem;

public class EventBSTMain {

    public static void main(String[] args) {

        EventBST booking = new EventBST();

        booking.addEvent(1800, "Concert Night");
        booking.addEvent(900, "Morning Yoga");
        booking.addEvent(1400, "Tech Talk");
        booking.addEvent(2000, "Movie Show");
        booking.addEvent(1100, "Startup Meetup");

        booking.showEvents();

        System.out.println("\nCancel Event at 1400");
        booking.cancelEvent(1400);

        booking.showEvents();
    }
}