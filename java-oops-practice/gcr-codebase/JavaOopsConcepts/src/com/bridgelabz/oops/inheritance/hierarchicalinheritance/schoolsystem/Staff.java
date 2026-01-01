package com.bridgelabz.oops.inheritance.hierarchicalinheritance.schoolsystem;

public class Staff extends Person{
	String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        displayBasicInfo();
        System.out.println(" | Role: Staff | Department: " + department);
    }
}
