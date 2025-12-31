package com.bridgelabz.oops.relationship;

public class CompanyDemo {
	public static void main(String[] args) {
        // Create a Company
        Company company = new Company("TechCorp");

        // Create Departments
        Department dept1 = new Department("Software");
        Department dept2 = new Department("HR");

        // Add Employees to the departments
        dept1.addEmployee(new Employee("Alice", 101));
        dept1.addEmployee(new Employee("Bob", 102));
        dept2.addEmployee(new Employee("Charlie", 201));
        dept2.addEmployee(new Employee("David", 202));

        // Add departments to the company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Display all departments and employees in the company
        company.showDepartments();
	}
}