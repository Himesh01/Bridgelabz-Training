package scenariobasedpractice.bookbazaar;

import java.util.ArrayList;

public class BookStore {
   ArrayList<Book> arr = new ArrayList<>();
   
   public BookStore() {
	   arr.add(new EBook(5,"Java-Programming","Lucky Pal",10000));
	   arr.add(new EBook(5,"Java-Oops","Lucky Pal",1000));
	   arr.add(new EBook(5,"Life Is Hard","Lucky Pal",100));
	   arr.add(new PrintedBook(10,"Python-Programming","Nageshwar",500));
	   arr.add(new PrintedBook(15,"How Thing works","Himesh",750));
   }
   
   public void view() {
	   for(Book b: arr) {
		   b.bookDetails();
	   }
   }
   
   public void buy(String title , int quantity) {
	   for(Book b: arr) {
		   if(b.title.equalsIgnoreCase(title)) {
			   b.buy(quantity);
			   return;
		   }
	   }
	   System.out.println("Book Not Found");
   }
}