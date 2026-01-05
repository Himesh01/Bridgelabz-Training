package com.stackqueue.circulartour;

public class CircularMain {
	public static void main(String[] args) {

        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        CircularTour tour = new CircularTour();
        int start = tour.findStartingPoint(pumps);

        System.out.println("Starting pump index: " + start);
    }
}
