package com.bridgelabz.oops.inheritance.vehicleandtransport;

public class Car extends Vehicle{
	int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Car: Max Speed = " + maxSpeed + " km/h, Fuel = " + fuelType + ", Seats = " + seatCapacity);
    }
}
