package genrics.smartwarehouse;

public class Furniture extends Product{
	   public String name;
	      public double price;
	      public double rating;
	      
	      public Furniture(String name, double price, double rating) {
	    	  this.name = name;
	    	  this.price = price;
	    	  this.rating = rating;
	      }
	      @Override
	      public String toString() {
	      	// TODO Auto-generated method stub
	      	return "\nProduct Name : "+this.name+" | Product Price : "+this.price+" | Product Rating : "+this.rating+" | Product Type : Furniture";
	      }
}