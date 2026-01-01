package com.bridgelabz.oops.inheritance.hybridinheritance.restaurantmanagemen;

public class RestaurantDemo {
public static void main(String[] args) {
		
		Chef c = new Chef("Himesh", "CHEF01");
		c.performDuties();
		
		Waiter w = new Waiter("Pappil", "WAITER01");
		w.performDuties();
	}
}
