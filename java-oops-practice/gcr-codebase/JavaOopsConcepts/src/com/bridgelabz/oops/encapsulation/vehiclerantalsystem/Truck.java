package com.bridgelabz.oops.encapsulation.vehiclerantalsystem;

public class Truck extends Vehicle implements Insurable {
	
	private double heavyLoadFee = 50.0;

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + heavyLoadFee;
    }

    @Override
    public double calculateInsurance(int days) {
        return 100.0 + (10.0 * days); 
    }

    @Override
    public String getInsuranceDetails() {
        return "Commercial Carrier Protection Plan";
    }
}