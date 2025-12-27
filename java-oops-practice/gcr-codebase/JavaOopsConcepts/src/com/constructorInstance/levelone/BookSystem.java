package com.constructorInstance.levelone;

public class BookSystem {

    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public BookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }

    // Display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {

        BookSystem b1 = new BookSystem("Data Engineering", "Himesh", 499.99, true);

        b1.display();

        b1.borrowBook();

        b1.borrowBook();
    }
}
