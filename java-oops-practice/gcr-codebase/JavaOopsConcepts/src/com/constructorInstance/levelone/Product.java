package com.constructorInstance.levelone;

public class Product {
	
	public String productName;
	public int price;
	static int count =0;
	
	public Product(String prodName, int price) {
		this.productName = prodName;
		this.price = price;
		this.count+=1;
	}
	
	public void displayProductDetails() {
		System.out.println("Product Name: "+this.productName);
		System.out.println("Product price: "+this.price);
	}
	
	
	public static void main(String[] args) {
		
		Product p1 = new Product("Rocket", 1000);
		Product p2 = new Product("Pen", 50);
		p1.displayProductDetails();
		p2.displayProductDetails();
		displayTotalProducts();

	}
	public static void displayTotalProducts() {
			System.out.println("Total product create: "+ count);			
	}
}