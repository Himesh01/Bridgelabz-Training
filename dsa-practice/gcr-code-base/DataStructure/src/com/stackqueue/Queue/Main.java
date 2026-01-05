package com.stackqueue.Queue;

public class Main {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		queue.enqueue(5);
		queue.dequeue();
	}
}
