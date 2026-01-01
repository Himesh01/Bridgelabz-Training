package com.bridgelabz.oops.inheritance.multilevelinheritance.onlineretailmanagement;

public class Order {
	String orderId;
	String orderDate;
	
	Order(String orderId ,String orderDate){
		this.orderId = orderId;
		this.orderDate  = orderDate;
	}
	
	public void getOrderStatus() {
		System.out.println("Order [" + orderId + "]: Placed on " + orderDate);
	}
}
