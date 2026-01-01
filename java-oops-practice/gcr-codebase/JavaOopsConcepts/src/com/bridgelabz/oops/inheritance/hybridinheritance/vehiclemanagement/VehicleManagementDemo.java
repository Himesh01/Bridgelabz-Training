package com.bridgelabz.oops.inheritance.hybridinheritance.vehiclemanagement;

public class VehicleManagementDemo {
public static void main(String[] args) {
		
		ElectricVehicle ev = new ElectricVehicle(80, "Ola S1x");
		ev.charge();
		
		PetrolVehicle pv = new PetrolVehicle(180, "TVS sports");
		pv.refuel();
	}
}
