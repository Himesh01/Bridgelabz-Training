package com.linkelist.undoredo;

public class TextEditor {
	 private TextState head;
	 private TextState tail;
	 private TextState current;
	 private int size;
	 private final int MAX_HISTORY = 10;
	 
	  

	 public void addState(String text) {
		 TextState newState = new TextState(text);

	        
		 if (current != null && current.next != null) {
			 current.next.prev = null;
			 current.next = null;
			 tail = current;
		 }

		 if (head == null) {
			 head = tail = current = newState;
			 size = 1;
			 return;
		 }

		 tail.next = newState;
		 newState.prev = tail;
		 tail = newState;
		 current = newState;
		 size++;

	       
		 if (size > MAX_HISTORY) {
			 head = head.next;
			 head.prev = null;
			 size--;
		 }
	 }

	    
	 public void undo() {
		 if (current == null || current.prev == null) {
			 System.out.println("Nothing to undo");
			 return;
		 }
		 current = current.prev;
	 }

	   
	 public void redo() {
		 if (current == null || current.next == null) {
			 System.out.println("Nothing to redo");
			 return;
		 }
		 current = current.next;
	 }

	   
	 public void displayCurrentState() {
		 if (current == null) {
			 System.out.println("Editor is empty");
			 return;
		 }
		 System.out.println("Current Text: " + current.content);
	 }
}
