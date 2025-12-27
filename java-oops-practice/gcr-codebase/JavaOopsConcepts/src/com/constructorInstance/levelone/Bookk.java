package com.constructorInstance.levelone;

public class Bookk {
	public long ISBN;
	protected String title;
	private String author;
	
	Bookk(long isbn, String title, String author){
		this.ISBN = isbn;
		this.title = title;
		this.author = author;
	}
	public void setName(String name) {
		this.author = name;
	}
	public void getName() {
		System.out.print("Author name: "+this.author);
	}
}