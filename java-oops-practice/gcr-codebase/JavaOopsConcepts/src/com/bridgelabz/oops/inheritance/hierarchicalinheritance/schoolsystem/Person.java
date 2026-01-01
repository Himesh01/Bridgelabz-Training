package com.bridgelabz.oops.inheritance.hierarchicalinheritance.schoolsystem;

public class Person {
	String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayBasicInfo() {
        System.out.print("Name: " + name + " | Age: " + age);
    }
}
