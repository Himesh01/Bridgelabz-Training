package com.stackqueue.slidingwindow;

public class StackNode {
	public int index;
	public StackNode next;
	public StackNode prev;
	
	public StackNode(int index) {
		this.index = index;
	}
}
