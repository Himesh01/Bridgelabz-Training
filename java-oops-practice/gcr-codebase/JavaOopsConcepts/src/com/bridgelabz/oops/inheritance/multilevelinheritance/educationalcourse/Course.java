package com.bridgelabz.oops.inheritance.multilevelinheritance.educationalcourse;

public class Course {
	String courseName;
    int durationWeeks;

    Course(String courseName, int durationWeeks) {
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }

    void displayDetails() {
        System.out.println("Course: " + courseName + " | Duration: " + durationWeeks + " weeks");
    }
}
