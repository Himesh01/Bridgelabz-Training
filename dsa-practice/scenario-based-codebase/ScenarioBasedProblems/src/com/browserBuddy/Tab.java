package com.browserBuddy;

public class Tab {
	private HistoryNode head;
	private HistoryNode current;
	
	public Tab(String homepage) {
		head = new HistoryNode(homepage);
		current = head;
	}
	
	public void visit(String url) {
		HistoryNode newNode = new HistoryNode(url);
		
		current.next = null;
		
		newNode.prev = current;
		current.next = newNode;
		current  = newNode;
	}
		
	public void back() {
		if (current.prev != null) {
			current = current.prev;
		} else {
			System.out.println("No previous page.");
		}
	}

	    // Move forward
	public void forward() {
		if (current.next != null) {
			current = current.next;
			
		} else {
			System.out.println("No forward page.");
		}
	}
	public String getCurrentPage() {
        return current.url;
    }
}
