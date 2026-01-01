package com.bridgelabz.oops.inheritance.hierarchicalinheritance.schoolsystem;

public class Student extends Person {
	String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        displayBasicInfo();
        System.out.println(" | Role: Student | Grade: " + grade);
    }
}
