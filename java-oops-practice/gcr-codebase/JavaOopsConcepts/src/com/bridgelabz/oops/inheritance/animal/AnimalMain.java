package com.bridgelabz.oops.inheritance.animal;

public class AnimalMain {
	public static void main(String[] args) {
		Animal[] animals = {
				new Animal("Dog",4),
				new Dog("lucky", 22),
				new Cat("Nag",24),
				new Bird("Himesh",21)
		};
		for(Animal a: animals) {
			a.makeSound();
		}
	}
}