package com.bridgelabz.oops.encapsulation.ecommerceplatform;

public class Clothing extends Product implements Taxable {
	
	public Clothing(String employeeID, String name, double price) {
		super(employeeID, name, price);
	}
	
	@Override
	public double calculateDiscount() {
		return getPrice()*0.10;
	}
	
	@Override
	public double calculateTax(double price) {
		return price*0.05;
	}
	@Override
	public void getTaxDetails() {
		System.out.println("Tax Category: Apparel (5%)");
	}
	
}