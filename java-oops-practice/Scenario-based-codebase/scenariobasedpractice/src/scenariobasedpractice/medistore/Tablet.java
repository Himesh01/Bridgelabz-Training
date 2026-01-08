package scenariobasedpractice.medistore;

import java.time.LocalDate;

public class Tablet extends Medicine{

	public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sell(int quantity) {
		 if((!checkExpiry(LocalDate.now()))&&(getQuantity()>=quantity)) {
			 System.out.println("\n----------------Bill----------------");
			 System.out.println("Price        : "+getPrice());
			 System.out.println("Quantity     : "+quantity);
			 System.out.println("Total Amount : "+(getPrice()*quantity));
			 System.out.println("Expiry Date  : "+getExpiryDate());
			 setQuantity(getQuantity()-quantity);
			 
		 }else {
			 System.out.println("Medicine Not Available");
		 }
	}
    
	@Override
	public boolean checkExpiry(LocalDate date) {
		// TODO Auto-generated method stub
		return date.isAfter(getExpiryDate())||date.isEqual(getExpiryDate());
	}
	
	public void details() {
		System.out.println("\n---------Medicine Details-----------");
		System.out.println("Name of Medicine : "+getName());
		System.out.println("Price            : "+getPrice());
		System.out.println("Available        : "+getQuantity());
		System.out.println("Expiry Date      : "+getExpiryDate());
	}
}