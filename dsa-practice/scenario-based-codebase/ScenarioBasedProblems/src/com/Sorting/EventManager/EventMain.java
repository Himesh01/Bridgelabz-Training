package com.Sorting.EventManager;

public class EventMain {

    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(101, 2500),
            new Ticket(102, 999),
            new Ticket(103, 1500),
            new Ticket(104, 5000),
            new Ticket(105, 1200)
        };

        System.out.println("Before Sorting:");
        for (Ticket t : tickets) {
            t.display();
        }

        Event.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting by Price:");
        for (Ticket t : tickets) {
            t.display();
        }
    }
}
