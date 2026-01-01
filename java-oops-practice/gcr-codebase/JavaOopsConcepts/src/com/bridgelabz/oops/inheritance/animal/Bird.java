package com.bridgelabz.oops.inheritance.animal;

public class Bird extends Animal{
	Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println(name + " says: Chirp! Chirp!");
	}
}
