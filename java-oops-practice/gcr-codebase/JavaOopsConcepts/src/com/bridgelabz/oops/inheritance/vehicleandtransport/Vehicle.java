package com.bridgelabz.oops.inheritance.vehicleandtransport;

public class Vehicle {
	int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Vehicle [Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType + "]");
    }
}
