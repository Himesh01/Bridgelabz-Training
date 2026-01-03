package com.linkelist.taskschedular;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	CircularLinkList list = new CircularLinkList();
    	Node n1 =new Node(101l,"Learn java",5,LocalDate.of(2026,12, 6));
    	Node n2 =new Node(102l,"Learn python",10,LocalDate.of(2026,12, 10));
    	Node n3 =new Node(103l,"Learn javascript",1,LocalDate.of(2026,12, 15));
        
    	list.add(n1);
    	list.add(n2);
    	list.add(n3);
    	list.display();
    }
}