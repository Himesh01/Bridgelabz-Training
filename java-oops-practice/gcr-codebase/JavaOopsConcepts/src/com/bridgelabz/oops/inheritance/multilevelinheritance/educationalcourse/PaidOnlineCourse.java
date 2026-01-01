package com.bridgelabz.oops.inheritance.multilevelinheritance.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse{
	double fee;
    double discount;

    PaidOnlineCourse(String courseName, int durationWeeks, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, durationWeeks, platform, isRecorded); // Passes data to OnlineCourse
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalPrice() {
        return fee - (fee * (discount / 100));
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Total Fee: $" + fee + " | Discount: " + discount + "%");
        System.out.println("Final Enrollment Price: $" + getFinalPrice());
    }
}
