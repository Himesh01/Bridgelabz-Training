package com.TailorShop;
import java.util.*;

public class TailorShop {
	private List<Order> orders = new ArrayList<>();

    public void addNewOrder(Order newOrder) {
        orders.add(newOrder);
        insertionSort();
        System.out.println("Added: " + newOrder.customerName + " | List updated.");
    }

    private void insertionSort() {
        int n = orders.size();
        for (int i = 1; i < n; ++i) {
            Order key = orders.get(i);
            int j = i - 1;

            while (j >= 0 && orders.get(j).deliveryDeadline > key.deliveryDeadline) {
                orders.set(j + 1, orders.get(j));
                j = j - 1;
            }
            orders.set(j + 1, key);
        }
    }
    
    public void displayOrders() {
        System.out.println("Current Tailor Schedule (Sorted by Deadline):");
        for (Order o : orders) {
            System.out.println(o);
        }
        System.out.println();
    }
}
