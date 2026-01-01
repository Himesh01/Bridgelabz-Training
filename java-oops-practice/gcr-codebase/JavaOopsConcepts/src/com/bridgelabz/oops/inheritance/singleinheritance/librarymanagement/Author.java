package com.bridgelabz.oops.inheritance.singleinheritance.librarymanagement;

public class Author extends Book {
	String name;
	String bio;
	
	Author(String title, int publicationYear ,String name ,String bio){
		super(title ,publicationYear);
		this.name =name;
		this.bio  = bio;
	}
	public void displayInfo() {
		displayBookInfo(); // Calling inherited method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
