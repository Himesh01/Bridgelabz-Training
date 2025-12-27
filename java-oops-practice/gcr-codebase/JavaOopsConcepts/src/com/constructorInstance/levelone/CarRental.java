package com.constructorInstance.levelone;

public class CarRental {

	public String customerName;
	public String carModel;
	public int rentalDays;
	int price;
		
	public CarRental(String name, String model, int days){
		this.customerName = name;
		this.carModel = model;
		this.rentalDays = days;
	}
	public void display() {
		System.out.println("Customer name: "+this.customerName);
		System.out.println("Car name: "+this.carModel);
		System.out.println("Renting days: "+this.rentalDays);
		System.out.println("total price: "+(2000*this.rentalDays));
	}
		
	public static void main(String args[]) {
		CarRental c = new CarRental("Himesh","Shelby", 5);
		c.display();
	}
}
