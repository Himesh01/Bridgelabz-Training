package com.bridgelabz.oops.encapsulation.employeemanagementsystem;

public abstract class Employee {
	private String employeeId;
	private String name;
	private double baseSalary;
	
	public Employee(String employeeId, String name, double baseSalary) {
		this.employeeId =employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public String getName() {
		return name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Name: "+name);
		System.out.println("Base salary: "+baseSalary);
		System.out.println("Final salary: "+calculateSalary());
	}
}
