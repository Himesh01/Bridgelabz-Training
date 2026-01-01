package com.bridgelabz.oops.inheritance.hybridinheritance.restaurantmanagemen;

public class Chef extends Person implements Worker{
	
	public Chef(String name, String id) {
		super(name, id);
	}
	
	@Override
	public void performDuties() {
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("Chef is making food\n");
	}
}