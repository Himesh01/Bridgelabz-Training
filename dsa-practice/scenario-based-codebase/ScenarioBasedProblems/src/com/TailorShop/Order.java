package com.TailorShop;

public class Order {
	String customerName;
    int deliveryDeadline;

    public Order(String customerName, int deliveryDeadline) {
        this.customerName = customerName;
        this.deliveryDeadline = deliveryDeadline;
    }

    @Override
    public String toString() {
        return String.format("[%s | Due in: %d days]", customerName, deliveryDeadline);
    }
}
