package com.Sorting.HospitalQueue;

public class HospitalQueueMain {

    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("Nilesh", 4),
            new Patient("Rajeev", 9),
            new Patient("Raj", 6),
            new Patient("Nitin", 10),
            new Patient("Prashant", 3)
        };

        System.out.println("Before Sorting:");
        for (Patient p : patients) {
            p.display();
        }

        HospitalQueue.bubbleSortByCriticality(patients);

        System.out.println("\nAfter Sorting by Criticality:");
        for (Patient p : patients) {
            p.display();
        }
    }
}
