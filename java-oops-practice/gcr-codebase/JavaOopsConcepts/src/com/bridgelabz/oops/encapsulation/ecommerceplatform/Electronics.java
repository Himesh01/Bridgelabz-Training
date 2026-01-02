package com.bridgelabz.oops.encapsulation.ecommerceplatform;

public class Electronics extends Product implements Taxable {
	
	public Electronics(String productID, String name, double price) {
		super(productID, name, price);
	}
	
	@Override
	public double calculateDiscount() {
		return getPrice()*0.10;
	}
	
	@Override
	public double calculateTax(double price) {
		return price*0.15;
	}
	
	@Override
	public void getTaxDetails() {
		System.out.println("Tax category: Electronics(15%) ");
	}
}