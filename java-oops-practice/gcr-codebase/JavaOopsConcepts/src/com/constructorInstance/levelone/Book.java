package com.constructorInstance.levelone;

public class Book {
	public String title;
	public String author;
	public Double price;
	
	public Book() {
		this.title ="Unknown Title";
		this.author ="Unknown Author";
		this .price = 0.0;
		System.out.println("Default Constructor : Created a book with default values.");
}
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		System.out.println("Parameterized Constructor : created Book "+title+ " .");
		
	}
	
	 public void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	    }
	
	public static void main(String[] args) {
		Book book = new Book();
		book.display();
		
		Book book1 = new Book("Quantum Computing","George",450);
		book1.display();
	}

}
