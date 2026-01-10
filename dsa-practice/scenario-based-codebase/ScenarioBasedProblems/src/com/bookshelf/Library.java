package com.bookshelf;
import java.util.*;

public class Library {

    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    private HashSet<Book> bookSet = new HashSet<>();

    public void addBook(String genre, Book book) {

        if (bookSet.contains(book)) {
            System.out.println("Duplicate book not allowed: " + book);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);

        bookSet.add(book);
        System.out.println("Book added: " + book);
    }

    public void borrowBook(String genre, Book book) {

        LinkedList<Book> books = catalog.get(genre);

        if (books != null && books.remove(book)) {
            bookSet.remove(book);
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not available");
        }
    }

    public void displayCatalog() {
        System.out.println("\nLibrary Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println(genre + " → " + catalog.get(genre));
        }
    }
}
