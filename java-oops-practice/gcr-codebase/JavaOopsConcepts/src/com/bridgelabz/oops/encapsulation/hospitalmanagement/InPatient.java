package com.bridgelabz.oops.encapsulation.hospitalmanagement;

import java.util.*;

class InPatient extends Patient implements MedicalRecord {

    private int numberOfDays;
    private double roomChargePerDay;
    private List<String> medicalHistory = new ArrayList<>();

    public InPatient(int id, String name, int age, int days, double roomCharge) {
        super(id, name, age);
        this.numberOfDays = days;
        this.roomChargePerDay = roomCharge;
    }

    @Override
    public double calculateBill() {
        return (numberOfDays * roomChargePerDay) + 5000; 
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String r : medicalHistory) {
            System.out.println("- " + r);
        }
    }
}
