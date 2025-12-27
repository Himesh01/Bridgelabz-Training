package com.constructorInstance.levelone;

public class Circle {
	public double radius;
	
	//default 
	public Circle() {
		this(5.0);
		System.out.println("Default constructor : set to 5.0");
	}
	
	//parameterized
	public Circle(double radius) {
		this.radius = radius;
		System.out.println("Parameterized Constructor, radius is "+ radius);
		
	}
	
	public void display() {
		System.out.println("Radius :"+ radius);
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.display();
		
		Circle c2 = new Circle(5.0);
		c2.display();

	}

}
