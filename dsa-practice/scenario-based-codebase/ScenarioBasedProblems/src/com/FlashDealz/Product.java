package com.FlashDealz;

public class Product {

	public String prodName;
	public double discount;
	
	public Product(String name, double discount) {
		this.prodName = name;
		this.discount =discount;
	}
	
	@Override
	public String toString() {
		return prodName+" - "+discount+" %";
	}
}