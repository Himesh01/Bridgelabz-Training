package com.stackqueue.sortstack;

public class Stack {
	Node top;
    
    public void push(int a) {
   	 Node node = new Node(a);
   	 if(top==null) {
   		 top = node;
   		 return;
   	 }
   	 node.next = top;
   	 top = node;
    }
    public Node pop() {
   	 Node n = top;
        top = top.next;
       return n;
    }
   
    public boolean isEmpty() {
   	 return top==null;
    }
}
