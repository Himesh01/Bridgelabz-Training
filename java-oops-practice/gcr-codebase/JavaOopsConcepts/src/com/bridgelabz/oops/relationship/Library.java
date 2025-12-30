package com.bridgelabz.oops.relationship;

import java.util.ArrayList;

public class Library{
	private String name;
	private ArrayList<Book> books;
	
	public Library(String name) {
		this.name = name;
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	public void displayBooks() {
		System.out.println("Library: "+name);
		for(Book book: books) {
			book.display();
		}
		System.out.println();
		
	}
	
}