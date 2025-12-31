package com.bridgelabz.oops.relationship;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees() {
        System.out.println("Employees in " + departmentName + " Department:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    @Override
    public String toString() {
        return "Department{DepartmentName='" + departmentName + "'}";
    }
}