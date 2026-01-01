package com.bridgelabz.oops.inheritance.multilevelinheritance.onlineretailmanagement;

public class DeliveredOrder extends ShippedOrder{
	String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Status: Delivered | Date: " + deliveryDate);
    }
}
