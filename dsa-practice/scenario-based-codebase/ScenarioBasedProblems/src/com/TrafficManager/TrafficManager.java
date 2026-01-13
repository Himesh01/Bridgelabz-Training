package com.TrafficManager;

public class TrafficManager {
	public static void main(String[] args) {
		Roundabout roundabout = new Roundabout();
		VehicleQueue waitingQueue = new VehicleQueue(3);
	
		waitingQueue.enqueue("CAR-101");
		waitingQueue.enqueue("CAR-102");
		waitingQueue.enqueue("CAR-103");
		waitingQueue.enqueue("CAR-104");
	
		while (!waitingQueue.isEmpty()) {
			String car = waitingQueue.dequeue();
			roundabout.addVehicle(car)	;
		}
	
		roundabout.printRoundabout();
	
		roundabout.removeVehicle();
	   	roundabout.printRoundabout();
	
	   	roundabout.removeVehicle();
	   	roundabout.removeVehicle();
	   	roundabout.removeVehicle();
	}
}
