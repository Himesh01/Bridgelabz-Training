package com.bridgelabz.oops.inheritance.employeemanagement;

public class EmployeeMain {
	public static void main(String[] args) {
        Manager mgr = new Manager("Himesh", 101, 90000, 10);
        Developer dev = new Developer("Lucky", 102, 75000, "Java");
        Intern intern = new Intern("Nageshwar", 103, 30000, "State University");

        System.out.println("--- Employee Details ---");
        mgr.displayDetails();
        System.out.println("------------------------");
        dev.displayDetails();
        System.out.println("------------------------");
        intern.displayDetails();
    }
}
