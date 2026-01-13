package com.TrafficManager;

public class Vehicle {
	String plateNumber;
	Vehicle next;

	Vehicle(String plateNumber) {
		this.plateNumber = plateNumber;
		this.next = null;
	}
}
