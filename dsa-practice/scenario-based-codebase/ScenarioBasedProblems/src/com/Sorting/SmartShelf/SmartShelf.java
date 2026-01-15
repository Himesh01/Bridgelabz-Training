package com.Sorting.SmartShelf;

public class SmartShelf {
    public static void insertionSortByTitle(Book[] books) {

        for (int i = 1; i < books.length; i++) {

            Book key = books[i];
            int j = i - 1;

            // Shift books greater than key to one position ahead
            while (j >= 0 && books[j].title.compareTo(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }
}
