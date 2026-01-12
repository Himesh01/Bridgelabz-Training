package com.TrainCompanion;

public class Compartment {
	String name;
	boolean hasPantry;
	boolean hasWifi;
	
	Compartment prev;
	Compartment next;
	
	public Compartment(String name, boolean hasPantry, boolean hasWifi) {
		this.name = name;
		this.hasPantry = hasPantry;
		this.hasWifi = hasWifi;
		this.prev =null;
		this.next = null;
	}
}
