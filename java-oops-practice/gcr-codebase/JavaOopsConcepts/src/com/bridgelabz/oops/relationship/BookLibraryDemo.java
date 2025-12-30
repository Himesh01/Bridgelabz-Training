package com.bridgelabz.oops.relationship;

public class BookLibraryDemo {
	public static void main(String[] args) {
		Book b1 = new Book("Ret ki Rani","Kaanta Bharti");
		Book b2 = new Book("Netaji ka Chasma","Swyam Prakash");
		
		Library cityLibrary = new Library("City Library");
		Library schoolLibrary = new Library("School Library");
		
		cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        schoolLibrary.addBook(b2); 

        
        cityLibrary.displayBooks();
        schoolLibrary.displayBooks();
	}
}
