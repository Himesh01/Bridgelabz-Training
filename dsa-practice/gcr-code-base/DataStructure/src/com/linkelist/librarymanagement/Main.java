package com.linkelist.librarymanagement;

public class Main {
	 public static void main(String[] args) {

	        Library lib = new Library();

	        lib.addAtEnd(101, "Java Basics", "James Gosling", "Programming", true);
	        lib.addAtEnd(102, "Clean Code", "Robert Martin", "Programming", true);
	        lib.addAtBeginning(103, "DSA in Java", "Narasimha Karumanchi", "Education", false);

	        System.out.println("All Books (Forward):");
	        lib.displayForward();

	        System.out.println("\nAll Books (Reverse):");
	        lib.displayReverse();

	        System.out.println("\nSearch by Author:");
	        lib.searchByAuthor("Robert Martin");

	        lib.updateAvailability(103, true);
	        lib.removeById(101);

	        System.out.println("\nFinal Library:");
	        lib.displayForward();

	        System.out.println("\nTotal Books: " + lib.countBooks());
	    }
}
