package com.bridgelabz.oops.inheritance.multilevelinheritance.educationalcourse;

public class OnlineCourse extends Course {
	String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int durationWeeks, String platform, boolean isRecorded) {
        super(courseName, durationWeeks); // Passes data to Course
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform + " | Format: " + (isRecorded ? "Recorded" : "Live"));
    }
}
