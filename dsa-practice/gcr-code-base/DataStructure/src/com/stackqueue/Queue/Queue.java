package com.stackqueue.Queue;

public class Queue {
	Stacks s1 = new Stacks();
    Stacks s2 = new Stacks();

    // Enqueue → O(1)
    public void enqueue(int data) {
        s1.push(new Stack(data));
    }

    // Dequeue → Amortized O(1)
    public void dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        System.out.println("Deleted element: " + s2.pop().data);
    }
}
