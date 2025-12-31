package com.bridgelabz.oops.relationship;
import java.util.ArrayList;
import java.util.List;

public class CustomerEcom {
	private String customerId;
	 private String name;
	 private List<Order> orders = new ArrayList<>();

	 public CustomerEcom(String customerId, String name) {
	     this.customerId = customerId;
	     this.name = name;
	 }

	 public void placeOrder(Order order) {
	     orders.add(order);
	 }
}
