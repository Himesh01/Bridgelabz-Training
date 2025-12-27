package com.constructorInstance.levelone;

public class Vehicle {

	public String ownerName;
	public String vehicleType;
	public static int registrationFee =500;
	
	public Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	public void displayVehicleDetails() {
		System.out.println("Owner name: "+this.ownerName);
		System.out.println("Vehicle type: "+this.vehicleType);
		System.out.println("Registration fee: "+this.registrationFee+"\n");
	}
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Himesh kurmi", "Two-whiller");
		v1.displayVehicleDetails();
		
		Vehicle.updateRegistrationFee(600);
		
		Vehicle v2 = new Vehicle("Ashish","Four-whiller");
		v2.displayVehicleDetails();
	}
	public static void updateRegistrationFee(int fee) {
		Vehicle.registrationFee = fee;
	}
}