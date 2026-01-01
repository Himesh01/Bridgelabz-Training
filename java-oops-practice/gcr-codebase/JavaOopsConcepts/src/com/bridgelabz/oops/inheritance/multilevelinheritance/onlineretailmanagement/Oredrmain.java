package com.bridgelabz.oops.inheritance.multilevelinheritance.onlineretailmanagement;

public class Oredrmain {
	public static void main(String[] args) {
        DeliveredOrder myOrder = new DeliveredOrder(
            "ORD-2026-X99", 
            "2026-01-01", 
            "TRK123456789", 
            "2026-01-05"
        );

        System.out.println("--- Tracking Order History ---");
        myOrder.getOrderStatus();
    }
}
