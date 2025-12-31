package com.bridgelabz.oops.relationship;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showDepartments() {
        System.out.println("Departments in " + companyName + ":");
        for (Department dept : departments) {
            System.out.println(dept);
            dept.showEmployees();  // Showing employees in the department
        }
    }

    @Override
    public String toString() {
        return "Company{CompanyName='" + companyName + "'}";
    }
}