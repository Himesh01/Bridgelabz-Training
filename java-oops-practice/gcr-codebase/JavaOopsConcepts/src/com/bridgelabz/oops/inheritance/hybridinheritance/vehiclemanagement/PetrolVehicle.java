package com.bridgelabz.oops.inheritance.hybridinheritance.vehiclemanagement;

public class PetrolVehicle extends Vehicle implements Refuelable{
	
	public PetrolVehicle(int maxSpeed, String model) {
		super(maxSpeed, model);
	}
	
	@Override
	public void refuel() {
		super.displayInfo();
		System.out.println("Your vehicle is refueling\n");
	}
}