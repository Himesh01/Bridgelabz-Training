package com.bridgelabz.oops.relationship;
import java.util.ArrayList;
import java.util.List;

public class Order {
	 private String orderId;
	 private List<ProductEcom> products = new ArrayList<>();

	 public Order(String orderId) {
	     this.orderId = orderId;
	 }

	 public void addProduct(ProductEcom product) {
	     products.add(product);
	 }

	 public double calculateTotal() {
	     return products.stream()
	                    .mapToDouble(ProductEcom::getPrice)
	                    .sum();
	 }
}
