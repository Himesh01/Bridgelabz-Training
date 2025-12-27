package com.constructorInstance.levelone;

public class Student {
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	Student(int rollNumber, String name, double cgpa){
		this.rollNumber = rollNumber;
		this.name = name;
		this.cgpa = cgpa;
	}
	public void updateCGPA(double cg) {
		this.cgpa = cg;
	}
	public void displayCGPA() {
		System.out.println("CGPA: "+this.cgpa);
	}
}