package com.bridgelabz.oops.inheritance.animal;

public class Animal {
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	void makeSound() {
		System.out.println("The animal makes a sound");
	}
}
