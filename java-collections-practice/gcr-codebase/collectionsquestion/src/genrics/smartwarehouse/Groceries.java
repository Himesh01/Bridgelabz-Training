package genrics.smartwarehouse;

public class Groceries extends Product{
      public String name;
      public double price;
      public double rating;
      
      public Groceries(String name, double price, double rating) {
    	  this.name = name;
    	  this.price = price;
    	  this.rating = rating;
      }
      @Override
      public String toString() {
      	// TODO Auto-generated method stub
      	return "\nProduct Name : "+this.name+" | Product Price : "+this.price+" | Product Rating : "+this.rating+" | Product Type : Groceries";
      }
}
