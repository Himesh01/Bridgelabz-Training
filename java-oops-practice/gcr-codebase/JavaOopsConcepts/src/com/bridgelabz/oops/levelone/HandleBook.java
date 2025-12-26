package com.bridgelabz.oops.levelone;

public class HandleBook {
	String title ;
	String author;
	double price;
	
	HandleBook(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
}
	
	public void displayBookDetails() {
		System.out.println("Title of the book: "+ title);
		System.out.println("Author of the book: "+ author);
		System.out.println("Price of the book: "+ price);
	}
	public static void main(String[] args) {
		HandleBook book = new HandleBook("king of ice","hsemih",456);
		book.displayBookDetails();
	}

}
