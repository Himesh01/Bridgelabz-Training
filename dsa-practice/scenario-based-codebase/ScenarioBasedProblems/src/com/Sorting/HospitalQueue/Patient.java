package com.Sorting.HospitalQueue;

public class Patient {
    String name;
    int criticality;

    public Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }

    public void display() {
        System.out.println(name + " | Criticality: " + criticality);
    }
}