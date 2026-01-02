package com.bridgelabz.oops.encapsulation.ridehailing;

public abstract class Vehicle {
    long vehicleId;
    String driverName;
    double ratePerKm;
	 public Vehicle(long vehicleId, String driverName, double ratePerKm) {
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
	 }
    public abstract void calculateFare(double distance);
    
    public void displayDetail() {
   	 System.out.println(" ");
   	 System.out.println("------------Vehicle Details------------");
   	 System.out.println("Vehicle Id    : "+this.vehicleId);
   	 System.out.println("Driver Name   : "+this.driverName);
        System.out.println("Rate per Km   : "+this.ratePerKm);
        
    }
}
