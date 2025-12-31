package com.bridgelabz.oops.relationship;

public class ECommerce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerEcom customer = new CustomerEcom("C1", "Alex");
		Order order = new Order("O1");
		
		order.addProduct(new ProductEcom("P1", "Laptop", 1000));
		order.addProduct(new ProductEcom("P2", "Mouse", 50));

		customer.placeOrder(order);

		System.out.println(order.calculateTotal()); // 1050
	}
}
