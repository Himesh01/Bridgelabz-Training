package com.FitnessTracker;

public class Person {
	public String name;
	public int steps;
	
	public Person(String name, int steps) {
		this.name=name;
		this.steps = steps;
	}
	
	@Override
	public String toString() {
		return name+" covers "+steps+" steps.";
	}
}
