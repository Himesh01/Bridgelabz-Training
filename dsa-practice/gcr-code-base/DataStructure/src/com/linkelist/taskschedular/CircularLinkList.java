package com.linkelist.taskschedular;

public class CircularLinkList {
	Node head;
    
    public void add(Node n) {
 	   if(head==null) {
 		   head = n;
 		   head.next= n;
 		   return;
 	   }
 	   if(head==head.next) {
 		   head.next = n;
 		   n.next = head;
 		   return;
 	   }
 	   Node cur = head;
 	   while(cur.next!=head) {
 		   cur = cur.next;
 	   }
 	   cur.next = n;
 	   n.next = head;
    }
    
    public void addAt(Node n, int idx) {
 	    if (head == null) {
 	        if (idx == 0) {
 	            head = n;
 	            n.next = n;
 	        } else {
 	            System.out.println("Index out of bound");
 	        }
 	        return;
 	    }
 	    if (idx == 0) {
 	        Node last = head;
 	        while (last.next != head) {
 	            last = last.next;
 	        }
 	        n.next = head;
 	        last.next = n;
 	        head = n;
 	        return;
 	    }

 	    // Case 3: Insert at middle or end
 	    Node prev = head;
 	    Node curr = head.next;
 	    int i = 1;

 	    while (curr != head) {
 	        if (i == idx) {
 	            prev.next = n;
 	            n.next = curr;
 	            return;
 	        }
 	        prev = curr;
 	        curr = curr.next;
 	        i++;
 	    }

 	    System.out.println("Index out of bound");
 	}

    public void display() {
 	   if(head==null) {
 		   System.out.println("The list is empty ");
 		   return;
 	   }
 	   Node cur = head;
 	   while(cur.next!=head) {
 		   System.out.println("  ");
 		   System.out.println("-----Task------");
 		   System.out.println("Task Id   : "+cur.id);
 		   System.out.println("Task name : "+cur.name);
 		   System.out.println("Priority  : "+cur.priority);
 		   System.out.println("Due Date  : "+cur.due);
 		   cur = cur.next;
 	   }
 	   System.out.println("  ");
		   System.out.println("-----Task------");
		   System.out.println("Task Id   : "+cur.id);
		   System.out.println("Task name : "+cur.name);
		   System.out.println("Priority  : "+cur.priority);
		   System.out.println("Due Date  : "+cur.due);
    }
}
