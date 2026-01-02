package com.bridgelabz.oops.encapsulation.vehiclerantalsystem;

import java.util.*;

public class RentalSystem {
	public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Car("CAR-99", 50.0, "POL88223344"));
        fleet.add(new Bike("BIKE-01", 15.0));
        fleet.add(new Truck("TRK-500", 120.0));

        int rentalDays = 7;
        System.out.println("--- Rental & Insurance Invoice (" + rentalDays + " Days) ---");

        for (Vehicle v : fleet) {
            v.getDetails();
            double rentalCost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost: $" + rentalCost);

            
            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                double insCost = i.calculateInsurance(rentalDays);
                System.out.println("Insurance: $" + insCost + " (" + i.getInsuranceDetails() + ")");
                System.out.println("Total: $" + (rentalCost + insCost));
            } else {
                System.out.println("Insurance: Not Required / Included");
            }
            System.out.println("-------------------------------------------");
        }
    }
}