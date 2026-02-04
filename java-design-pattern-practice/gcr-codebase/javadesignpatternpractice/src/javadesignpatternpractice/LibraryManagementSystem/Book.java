package javadesignpatternpractice.LibraryManagementSystem;


public class Book {

	 private String title;
	 private Book(BookBuilder builder) {
	     this.title = builder.title;
	 }
	
	 public String getTitle() {
	     return title;
	 }
	
	 public static class BookBuilder {
	
	     private String title;   // Mandatory
	     public BookBuilder(String title) {
	         this.title = title;
	     }
	
	     public BookBuilder author(String author) {
	         return this;
	     }
	
	     public BookBuilder edition(String edition) {
	         return this;
	     }
	
	     public BookBuilder genre(String genre) {
	         return this;
	     }
	
	     public BookBuilder publisher(String publisher) {
	         return this;
	     }
	
	     public Book build() {
	         return new Book(this);
	     }
	 }
}
