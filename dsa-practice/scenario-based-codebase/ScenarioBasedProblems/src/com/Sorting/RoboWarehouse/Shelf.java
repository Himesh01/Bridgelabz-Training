package com.Sorting.RoboWarehouse;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Package> packages;

    public Shelf() {
        this.packages = new ArrayList<>();
    }

    public void addPackage(Package newPackage) {
        int i = packages.size() - 1;
        
        packages.add(newPackage);
        
        while (i >= 0 && packages.get(i).getWeight() > newPackage.getWeight()) {
            packages.set(i + 1, packages.get(i));
            i--;
        }
        packages.set(i + 1, newPackage);
        
        System.out.println("Robot inserted: " + newPackage);
    }

    public void displayShelf() {
        System.out.println("Current Shelf Order: " + packages);
    }
}
