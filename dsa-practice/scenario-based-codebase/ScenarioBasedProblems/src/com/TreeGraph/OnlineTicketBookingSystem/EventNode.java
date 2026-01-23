package com.TreeGraph.OnlineTicketBookingSystem;

public class EventNode {

    int time;    
    String eventName;

    EventNode left, right;

    public EventNode(int time, String eventName) {
        this.time = time;
        this.eventName = eventName;
        this.left = null;
        this.right = null;
    }
}