package com.Sorting.SmartShelf;

public class Book {
	String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println(title + " by " + author);
    }
}
