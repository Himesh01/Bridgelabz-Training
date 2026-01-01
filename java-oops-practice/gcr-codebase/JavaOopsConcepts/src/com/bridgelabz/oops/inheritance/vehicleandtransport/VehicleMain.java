package com.bridgelabz.oops.inheritance.vehicleandtransport;

public class VehicleMain {
	 public static void main(String[] args) {
		
		 Vehicle[] vehicles = {
				 new Car(180, "Gasoline", 5),
				 new Truck(120, "Diesel", 10.5),
				 new Motorcycle(150, "Gasoline", false)
		 };

		 System.out.println("--- Transport System Fleet Info ---");
		 for (Vehicle v : vehicles) {
		
			 v.displayInfo(); 
		 }
	 }
}
