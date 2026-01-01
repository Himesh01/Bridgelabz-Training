package com.bridgelabz.oops.inheritance.vehicleandtransport;

public class Motorcycle extends Vehicle {
	boolean hasSidecar;

    Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle: Max Speed = " + maxSpeed + " km/h, Fuel = " + fuelType + ", Sidecar: " + hasSidecar);
    }
}
