package com.bridgelabz.oops.inheritance.hybridinheritance.vehiclemanagement;

public class Vehicle {
	public int maxSpeed;
	public String model;
	
	public Vehicle(int maxSpeed, String model) {
		this.maxSpeed =maxSpeed;
		this.model = model;
	}
	
	public void displayInfo() {
		System.out.println("model: "+model);
		System.out.println("max speed: "+maxSpeed);
	}
}
