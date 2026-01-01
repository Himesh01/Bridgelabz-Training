package com.bridgelabz.oops.inheritance.multilevelinheritance.educationalcourse;

public class CourseMain {
	public static void main(String[] args) {
        // Creating an object of the most specialized class in 2026
        PaidOnlineCourse advancedJava = new PaidOnlineCourse(
            "Advanced Java 2026", 
            12, 
            "BridgeLabz", 
            true, 
            499.99, 
            15.0
        );

        System.out.println("--- Course Enrollment Details ---");
        advancedJava.displayDetails();
    }
}
