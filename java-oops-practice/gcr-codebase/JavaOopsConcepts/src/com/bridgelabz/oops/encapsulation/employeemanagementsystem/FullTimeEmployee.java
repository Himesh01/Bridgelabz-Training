package com.bridgelabz.oops.encapsulation.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department{
	
	private String department;
	private double bonus;
	
	public FullTimeEmployee(String employeeId, String name, double baseSalary, double bonus) {
		super(employeeId, name, baseSalary);
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return getBaseSalary()+bonus;
	}
	
	@Override
	public void assignDepartment(String deptName) {
		this.department = deptName;		
	}
	
	@Override
	public String getDepartmentDetails() {
		return "Dept: "+department;
	}
}