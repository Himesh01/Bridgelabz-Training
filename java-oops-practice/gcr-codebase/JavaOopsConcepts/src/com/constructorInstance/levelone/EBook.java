package com.constructorInstance.levelone;

public class EBook extends Bookk{
	public EBook(long isbn, String title, String author) {
		super(isbn, title, author);
	}
	public static void main(String[] args) {
		EBook b = new EBook(10987654321L,"Time Traveller", "Himeos piol");
		System.out.println("ISBN number: "+b.ISBN);   
		System.out.println("Title name: "+b.title);
		b.getName();
		b.setName("Himeos piol");
		b.getName();
	}	
	
}