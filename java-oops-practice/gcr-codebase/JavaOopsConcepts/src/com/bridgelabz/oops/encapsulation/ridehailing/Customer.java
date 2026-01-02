package com.bridgelabz.oops.encapsulation.ridehailing;

public class Customer {
	 public static void main(String[] args) {
		   Car car = new Car(101l,"Rajeev",7,"Bhopal");
		   Bike bike = new Bike(102l,"Lucky",5,"Pathani");
		   Auto auto = new Auto(103l,"Nageshwar",3.5,"Anad Nagar");
		   
		   car.displayDetail();
		   bike.displayDetail();
		   auto.displayDetail();
	   }
}
