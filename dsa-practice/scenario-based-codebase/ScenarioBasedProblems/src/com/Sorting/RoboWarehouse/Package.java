package com.Sorting.RoboWarehouse;

public class Package {
	private String id;
	private double weight;
	
	public Package(String id, double weight) {
		this.id = id;
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "["+id +": " + weight +"]";
	}
}
