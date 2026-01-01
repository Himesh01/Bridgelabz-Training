package com.bridgelabz.oops.inheritance.hybridinheritance.restaurantmanagemen;

public class Waiter extends Person implements Worker{
	
	public Waiter(String name, String id) {
		super(name, id);
	}
	
	@Override
	public void performDuties() {
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("Waiter is serving food\n");
	}
}
