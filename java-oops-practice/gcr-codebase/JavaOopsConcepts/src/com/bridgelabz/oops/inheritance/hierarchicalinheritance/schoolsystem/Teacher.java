package com.bridgelabz.oops.inheritance.hierarchicalinheritance.schoolsystem;

public class Teacher extends Person{
	String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        displayBasicInfo();
        System.out.println(" | Role: Teacher | Subject: " + subject);
    }
}
