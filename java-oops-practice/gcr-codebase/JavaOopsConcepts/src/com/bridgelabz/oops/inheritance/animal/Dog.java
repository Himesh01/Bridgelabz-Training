package com.bridgelabz.oops.inheritance.animal;

public class  Dog extends Animal {
	Dog(String name, int age){
		super(name , age);
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " says: Woof! Woof!");
	}
}
