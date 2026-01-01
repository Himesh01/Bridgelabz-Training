package com.bridgelabz.oops.inheritance.singleinheritance.librarymanagement;

public class Book {
	String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Published: " + publicationYear);
    }
}
