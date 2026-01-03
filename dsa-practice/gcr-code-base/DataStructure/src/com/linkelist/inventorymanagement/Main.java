package com.linkelist.inventorymanagement;

public class Main {
	public static void main(String[] args) {

        Inventry inv = new Inventry();

        inv.addAtEnd(101, "Laptop", 5, 55000);
        inv.addAtEnd(102, "Mouse", 20, 500);
        inv.addAtBeginning(103, "Keyboard", 10, 1500);

        System.out.println("Inventory:");
        inv.displayInventory();

        System.out.println("\nTotal Inventory Value: " + inv.totalInventoryValue());

        System.out.println("\nAfter Sorting by Price Ascending:");
        inv.sortByPrice(true);
        inv.displayInventory();

        System.out.println("\nSearch by ID 102:");
        inv.searchById(102);

        inv.updateQuantity(101, 7);
        inv.removeById(103);

        System.out.println("\nFinal Inventory:");
        inv.displayInventory();
    }
}
