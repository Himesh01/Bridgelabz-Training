package com.bridgelabz.oops.relationship;

import java.util.ArrayList;
import java.util.List;

public class UniversityDepartment {
    private String departmentName;
    private List<Faculty> facultyMembers;

    public UniversityDepartment(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addFaculty(Faculty faculty) {
        if (!facultyMembers.contains(faculty)) {
            facultyMembers.add(faculty);
        }
    }

    public void showFacultyMembers() {
        System.out.println("Faculty in " + departmentName + " Department:");
        for (Faculty faculty : facultyMembers) {
            System.out.println(faculty);
        }
    }

    @Override
    public String toString() {
        return "Department{DepartmentName='" + departmentName + "'}";
    }
}