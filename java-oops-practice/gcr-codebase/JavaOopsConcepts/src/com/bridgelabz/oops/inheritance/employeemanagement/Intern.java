package com.bridgelabz.oops.inheritance.employeemanagement;

public class Intern extends Employee{
	String schoolName;

    Intern(String name, int id, double salary, String schoolName) {
        super(name, id, salary);
        this.schoolName = schoolName;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern | University: " + schoolName);
    }
}
