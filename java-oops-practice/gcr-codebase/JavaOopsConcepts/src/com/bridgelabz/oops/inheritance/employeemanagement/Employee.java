package com.bridgelabz.oops.inheritance.employeemanagement;

public class Employee {
	String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Base Salary: $" + salary);
    }
}
