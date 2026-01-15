package com.SmartCheckout;
import java.util.*;

public class SmartCheckoutDemo {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        checkout.priceMap.put("Milk", 50);
        checkout.priceMap.put("Bread", 40);
        checkout.priceMap.put("Eggs", 6);

        checkout.stockMap.put("Milk", 5);
        checkout.stockMap.put("Bread", 2);
        checkout.stockMap.put("Eggs", 12);

        Customer c1 = new Customer("Himesh", Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Amit", Arrays.asList("Eggs", "Milk", "Bread"));

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        checkout.processCustomer();
        checkout.processCustomer();
    }
}
