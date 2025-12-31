package com.bridgelabz.oops.relationship;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String universityName;
    private List<UniversityDepartment> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void addDepartment(UniversityDepartment department) {
        departments.add(department);
    }

    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (UniversityDepartment dept : departments) {
            System.out.println(dept);
            dept.showFacultyMembers();
        }
    }

    @Override
    public String toString() {
        return "University{UniversityName='" + universityName + "'}";
    }
}