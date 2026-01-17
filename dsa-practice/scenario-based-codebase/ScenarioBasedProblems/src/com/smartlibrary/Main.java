package com.smartlibrary;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] books = {new Book("Give it All", "H80798"), new Book("Business Things", "B70798"), new Book("Doglapan", "D50498"), new Book("Atomic Habit", "A70798")};
		InsertionSort.insertionSort(books);
		
		System.out.println("..........Books Sorted Alphabatically...... ");
		for(Book book: books) {
			System.out.println(book.name + " - " + book.isbn);
		}
		
	}

}