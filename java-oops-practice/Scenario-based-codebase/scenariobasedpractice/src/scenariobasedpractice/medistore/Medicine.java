package scenariobasedpractice.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable{
       private String name;
       private double price;
       private LocalDate expiryDate;
       private int quantity;
	  
       public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
	   }

	   public String getName() {
		   return name;
	   }

	   public void setName(String name) {
		   this.name = name;
	   }

	   public double getPrice() {
		   return price;
	   }

	   public void setPrice(double price) {
		   this.price = price;
	   }

	   public LocalDate getExpiryDate() {
		   return expiryDate;
	   }

	   public void setExpiryDate(LocalDate expiryDate) {
		   this.expiryDate = expiryDate;
	   }

	   public int getQuantity() {
		   return quantity;
	   }

	   public void setQuantity(int quantity) {
		   this.quantity = quantity;
	   }

	   @Override
	   public boolean checkExpiry(LocalDate date) {
		return false;
	   }

	   @Override
	   public void sell(int quantity) {
		
	   }
      public abstract void details();
            
}