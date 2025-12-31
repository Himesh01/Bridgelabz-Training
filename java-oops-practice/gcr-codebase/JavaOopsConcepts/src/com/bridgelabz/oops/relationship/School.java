package com.bridgelabz.oops.relationship;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}