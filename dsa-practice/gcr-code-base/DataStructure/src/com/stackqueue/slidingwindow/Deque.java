package com.stackqueue.slidingwindow;

public class Deque {
	private StackNode head;
	private StackNode tail;
	 
	public void addLast(int index) {
		StackNode newNode = new StackNode(index);
		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	 
	 public void removeFirst() {
		 if (head == null) 
			 return;
		 
		 if (head == tail) {
			 head = tail = null;
		 } 
		 else {
			 head = head.next;
			 head.prev = null;
		 }
	 }
	 
	 public void removeLast() {
		 if (tail == null) 
			 return;
		 
		 if (head == tail) {
			 head = tail = null;
		 }
		 else {
			 tail = tail.prev;
			 tail.next = null;
		 }
	 }
	 
	 public int peekFirst() {
		 return (head != null) ? head.index : -1;
	 }

	 public int peekLast() {
		 return (tail != null) ? tail.index : -1;
	 }

	 public boolean isEmpty() {
		 return head == null;
	 }
}
