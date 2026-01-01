package com.bridgelabz.oops.inheritance.singleinheritance.librarymanagement;

public class BookMain {
	public static void main(String[] args) {
		Author myAuthor = new Author(
	            "Java Programming", 
	            2026, 
	            "Jane Doe", 
	            "An expert in software architecture and OOP."
	        );

	        System.out.println("--- Library Record ---");
	        myAuthor.displayInfo();
	}
}
