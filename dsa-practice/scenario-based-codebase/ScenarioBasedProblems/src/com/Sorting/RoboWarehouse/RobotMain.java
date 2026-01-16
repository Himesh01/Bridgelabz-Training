package com.Sorting.RoboWarehouse;

public class RobotMain {
	
    public static void main(String[] args) {
        Shelf warehouseShelf = new Shelf();

        Package[] incomingPackages = {
            new Package("PKG-A", 15.5),
            new Package("PKG-B", 5.2),
            new Package("PKG-C", 10.0),
            new Package("PKG-D", 2.1),
            new Package("PKG-E", 12.3)
        };

        System.out.println("--- RoboWarehouse Loading Sequence ---");
        
        for (Package p : incomingPackages) {
            warehouseShelf.addPackage(p);
            warehouseShelf.displayShelf();
            System.out.println("------------------------------------");
        }
    }
}
