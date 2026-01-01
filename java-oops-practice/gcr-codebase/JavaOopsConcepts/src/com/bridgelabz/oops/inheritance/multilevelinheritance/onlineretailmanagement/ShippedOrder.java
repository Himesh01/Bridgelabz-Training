package com.bridgelabz.oops.inheritance.multilevelinheritance.onlineretailmanagement;

public class ShippedOrder extends Order {
	String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Passing data to Level 1
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Status: Shipped | Tracking #: " + trackingNumber);
    }
}
