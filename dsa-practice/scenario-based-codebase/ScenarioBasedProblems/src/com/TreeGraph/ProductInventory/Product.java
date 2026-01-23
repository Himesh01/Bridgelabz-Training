package com.TreeGraph.ProductInventory;

public class Product {
	public int sku;
	public String name;
	public double price;
	
	public Product(int sku, String name, double price) {
		this.sku = sku;
		this.name = name;
		this.price =price;
	}
	
	@Override
	public String toString() {
		return "SKU: "+sku+", Name: "+name+", Price: "+price;
	}
}
