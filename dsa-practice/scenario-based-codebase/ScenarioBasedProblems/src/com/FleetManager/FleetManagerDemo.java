package com.FleetManager;

public class FleetManagerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle[] vehiclesCar = {new Vehicle("C101", "Car", 19.8), new Vehicle("C102", "Car", 11.4), new Vehicle("C103", "Car", 15.6), new Vehicle("C104", "Car", 25.6)};
		Vehicle[] vehiclesBike = {new Vehicle("B101", "Bike", 16.7), new Vehicle("B102", "Bike", 22.3), new Vehicle("B103", "Bike", 35.6), new Vehicle("B104", "Bike", 32.8)};
		
		int totalSize = vehiclesCar.length + vehiclesBike.length;
		Vehicle[] masterList = new Vehicle[totalSize];
		
		int idx = 0;
		for(int i=0; i<vehiclesCar.length; i++)
			masterList[idx++] = vehiclesCar[i];
		
		for(int i=0; i<vehiclesBike.length; i++)
			masterList[idx++] = vehiclesBike[i];
		
		MergeSort.mergeSort(masterList, 0, totalSize-1);
		
		System.out.println("Master List .................: ");
		for(Vehicle vehicle: masterList) {
			System.out.println(vehicle.vehicleId + " - " + vehicle.vehicleType + "  -  " +  vehicle.mileage);
		}
	}

}