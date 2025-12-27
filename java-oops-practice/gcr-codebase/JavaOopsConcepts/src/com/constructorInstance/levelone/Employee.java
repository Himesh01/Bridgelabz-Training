package com.constructorInstance.levelone;

public class Employee {

	public int employeeID;
	protected String department;
	private double salary;
	
	public Employee(int employeeID, String dept, double salary) {
		this.employeeID= employeeID;
		this.department= dept;
		this.salary = salary;
	}
	
	public void updateSalary(double salary) {
		this.salary =salary;
	}
}