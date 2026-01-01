package com.bridgelabz.oops.inheritance.employeemanagement;

public class Manager extends Employee {
	int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Call base class constructor
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager | Team Size: " + teamSize);
    }
}
