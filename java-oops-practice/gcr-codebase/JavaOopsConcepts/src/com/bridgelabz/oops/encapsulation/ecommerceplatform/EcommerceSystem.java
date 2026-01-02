package com.bridgelabz.oops.encapsulation.ecommerceplatform;

import java.util.*;
public class EcommerceSystem {
	public static void main(String[] args) {
		List<Product> cart = new ArrayList<>();
        cart.add(new Electronics("E404", "Television", 800.0));
        cart.add(new Clothing("C101", "Denim pant", 120.0));
        cart.add(new Groceries("G55", "Choclate", 4.50));

        for (Product p : cart) {
            p.displayInfo();
            
            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                t.getTaxDetails();
                System.out.println("Tax Amount: $" + t.calculateTax(p.getPrice()));
            }
            System.out.println("----------------------------");
        }
	}
}
