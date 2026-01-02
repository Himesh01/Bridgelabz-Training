package com.bridgelabz.oops.encapsulation.ecommerceplatform;

public abstract class Product {
	private String productID;
	private String name;
	private double price;
	
	public Product(String productID, String name, double price) {
		this.productID = productID;
		this.name = name;
		this.price = price;
	}
	
	public String getProductID() {
		return productID;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract double calculateDiscount();
	
	public void displayInfo() {
		double finalPrice = price -calculateDiscount();
		System.out.println("Product id: "+productID);
		System.out.println("Name: "+name);
		System.out.println("Original Price: "+price);
		System.out.println("Discounted Price: "+finalPrice);
	}
}
