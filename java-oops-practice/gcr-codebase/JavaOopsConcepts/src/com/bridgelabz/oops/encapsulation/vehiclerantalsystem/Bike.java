package com.bridgelabz.oops.encapsulation.vehiclerantalsystem;

public class Bike extends Vehicle{
	
	public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double total = getRentalRate() * days;
        return (days > 5) ? total * 0.90 : total;
    }
}
