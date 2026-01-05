package com.stackqueue.Queue;

public class Stacks {
	Stack top;
    
    public void push(Stack s) {
   	 if(top==null) {
   		 top = s;
   		 return;
   	 }
   	 s.next = top;
   	 top = s;
    }
    public Stack pop() {
   	 if(top==null) {
   		 System.out.println("Stack underflow !");
   		 return null;
   	 }
   	
   	 Stack s = top;
   	 top = top.next;
   	 return s;
    }
    
    public Stack top() {
   	
   	 return top;
    }
    public boolean isEmpty() {
   	 return top==null;
    }
}
