package com.Sorting.SmartShelf;

public class SmartShelfMain {
    public static void main(String[] args) {

        Book[] readingList = {
            new Book("Algorithms", "CLRS"),
            new Book("Clean Code", "Himesh"),
            new Book("Design Patterns", "Raj"),
            new Book("Data Structures", "jay")
        };

        System.out.println("Before Sorting:");
        for (Book b : readingList) {
            b.display();
        }

        SmartShelf.insertionSortByTitle(readingList);

        System.out.println("\nAfter Sorting (Alphabetical):");
        for (Book b : readingList) {
            b.display();
        }
    }
}
