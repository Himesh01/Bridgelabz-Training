package com.bookShelff;

public class BookShelfMain {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("Animal Farm", "George Orwell");
        Book b3 = new Book("Dune", "Frank Herbert");

        library.addBook("Fiction", b1);
        library.addBook("Fiction", b2);
        library.addBook("Sci-Fi", b3);

        library.displayCatalog();

        library.borrowBook("Fiction", b1);
        library.displayCatalog();
    }
}
