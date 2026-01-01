package com.bridgelabz.oops.inheritance.vehicleandtransport;

public class Truck extends Vehicle{
	double payloadCapacity; // in tons

    Truck(int maxSpeed, String fuelType, double payloadCapacity) {
        super(maxSpeed, fuelType);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Truck: Max Speed = " + maxSpeed + " km/h, Fuel = " + fuelType + ", Payload = " + payloadCapacity + " tons");
    }
}
