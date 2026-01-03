package com.linkelist.studentrecord;

public class LinkListMain {
	public static void main(String[] args) {
    	LinkList list = new LinkList();
    	list.addStudent("Himesh",22 ,101,'A');
    	list.addStudent("Lokesh", 21, 102, 'B');
    	list.atPosition("Ramesh", 23, 103, 'B', 1);
    	
    	list.updateGrade(102, 'A');
    	list.displayAll();
    	
    }
}
