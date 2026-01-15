package com.ParcelTracker;

public class StageNode {
	String stage;
    StageNode next;

    public StageNode(String stage) {
        this.stage = stage;
        this.next = null;
    }
}