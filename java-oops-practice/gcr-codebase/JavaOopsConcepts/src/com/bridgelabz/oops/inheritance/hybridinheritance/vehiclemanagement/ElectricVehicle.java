package com.bridgelabz.oops.inheritance.hybridinheritance.vehiclemanagement;

public class ElectricVehicle extends Vehicle{
	
	public ElectricVehicle(int maxSpeed, String model) {
		super(maxSpeed, model);
	}
	
	public void charge() {
		super.displayInfo();
		System.out.println("Your vehicle is charging\n");
	}
}
