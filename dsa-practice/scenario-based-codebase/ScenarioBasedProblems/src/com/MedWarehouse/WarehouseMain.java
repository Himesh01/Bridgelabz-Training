package com.MedWarehouse;

public class WarehouseMain {

    public static void main(String[] args) {
    	
        Medicine[] stockArrival = {
            new Medicine("CombiFlame", 12),
            new Medicine("Glucose", 150),
            new Medicine("Disprin", 25),
            new Medicine("Paracetamol", 5),
            new Medicine("Vitamin D", 200),
            new Medicine("Ibuprofen", 45)
        };

        WareHouse manager = new WareHouse();

        System.out.println("2026 MedWarehouse: Compiling master inventory via Merge Sort...");
        manager.sortInventory(stockArrival);

        System.out.println("\nMaster FEFO List (First Expired, First Out):");
        System.out.println("-----------------------------------------------");
        for (Medicine med : stockArrival) {
            System.out.println(med);
        }
        System.out.println("-----------------------------------------------");
    }
}
