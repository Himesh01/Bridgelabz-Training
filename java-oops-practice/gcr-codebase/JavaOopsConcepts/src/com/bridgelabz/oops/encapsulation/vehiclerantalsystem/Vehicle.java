package com.bridgelabz.oops.encapsulation.vehiclerantalsystem;

public abstract class Vehicle {
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	
	public Vehicle(String vehicleNumber, String type, double rentalRate) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}
	
	public abstract double calculateRentalCost(int days);
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public String getVehicleType() {
		return type;
	}
	public double getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	
	public void getDetails() {
		System.out.println("Vehicle number: "+vehicleNumber);
		System.out.println("Vehicle type: "+type);
		System.out.println("Rental rate: "+rentalRate);
	}
	
}