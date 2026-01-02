package com.bridgelabz.oops.encapsulation.hospitalmanagement;

import java.util.*;

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private List<String> medicalHistory = new ArrayList<>();

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee + 500; // tests fee
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : medicalHistory) {
            System.out.println("- " + r);
        }
    }
}