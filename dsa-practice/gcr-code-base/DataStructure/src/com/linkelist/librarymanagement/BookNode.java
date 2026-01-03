package com.linkelist.librarymanagement;

public class BookNode {
	int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    BookNode next;
    BookNode prev;

    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
