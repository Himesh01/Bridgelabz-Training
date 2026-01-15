package com.SmartCheckout;

import java.util.*;

public class SmartCheckout {

	Queue<Customer> customerQueue = new LinkedList<>();
	HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    public void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println(customer.name + " added to queue");
    }

    public void processCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = customerQueue.poll();
        int totalBill = 0;

        System.out.println("\nBilling for " + customer.name);

        for (String item : customer.items) {
            if (stockMap.getOrDefault(item, 0) > 0) {
                totalBill += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
                System.out.println(item + " purchased for ₹" + priceMap.get(item));
            } else {
                System.out.println(item + " is OUT OF STOCK");
            }
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }
}
