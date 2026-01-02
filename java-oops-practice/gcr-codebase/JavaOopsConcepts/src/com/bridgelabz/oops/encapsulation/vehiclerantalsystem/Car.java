package com.bridgelabz.oops.encapsulation.vehiclerantalsystem;

public class Car extends Vehicle implements Insurable{
	
	private String policyNumber;
	public Car(String vehicleNumber, double rentalRate, String policyNumber) {
		super(vehicleNumber, "Car", rentalRate);
		this.policyNumber = policyNumber;
	}
	
	@Override 
	public double calculateRentalCost(int days) {
		return getRentalRate()*days;
	}
	
	@Override
	public double calculateInsurance(int days) {
		return (getRentalRate()*0.05)*days;
	}
	
	@Override
	public String getInsuranceDetails() {
		return "Policy: "+ policyNumber.substring(0,3) + "****";
	}
	
	
}