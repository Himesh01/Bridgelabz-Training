package com.AmbulanceRoute;

public class AmbulanceMain {

	public static void main(String[] args) {
		
		AmbulanceRoute route = new AmbulanceRoute();
		
		route.addUnit("Emergency", false);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", true);
		route.addUnit("ICU", false);
		
		route.displayRoute();
		
		route.findAvailableUnit();   // Should redirect to Surgery
		
		route.removeUnit("Radiology");
		route.displayRoute();
		
		route.findAvailableUnit();
	}
}