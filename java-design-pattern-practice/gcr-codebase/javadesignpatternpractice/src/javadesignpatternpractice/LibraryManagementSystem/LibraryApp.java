package javadesignpatternpractice.LibraryManagementSystem;

public class LibraryApp {

	 public static void main(String[] args) {
	
	     LibraryCatalog catalog = LibraryCatalog.getInstance();
	
	     User student = UserFactory.createUser("student", "Himesh");
	     User faculty = UserFactory.createUser("faculty", "Dr. Lucky");
	
	     student.showRole();
	     faculty.showRole();
	
	     catalog.addObserver(student);
	     catalog.addObserver(faculty);
	
	     Book book = new Book.BookBuilder("Design Patterns")
	             .author("Gang of Four")
	             .edition("2nd Edition")
	             .genre("Software Engineering")
	             .publisher("Pearson")
	             .build();
	
	     catalog.addBook(book);
	 }
}
