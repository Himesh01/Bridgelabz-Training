package scenariobasedpractice.bookbazaar;

public abstract class Book {
       int stock;
       String title;
       String author;
       double price;
	   
       
       public Book(int stock, String title, String author, double price) {
		this.stock = stock;
		this.title = title;
		this.author = author;
		this.price = price;
	   }
	  public void bookDetails() {
		  System.out.println("\n------Book Details------");
		  System.out.println("Title  : "+this.title);
		  System.out.println("Author : "+this.author);
		  System.out.println("Price  : "+this.price);
		  System.out.println("Stock  : "+this.stock);
	  }
     public abstract void buy(int quantity);
}