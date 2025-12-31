package com.bridgelabz.oops.relationship;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private int doctorId;
    private List<Patient> patients;

    public Doctor(String name, int doctorId) {
        this.name = name;
        this.doctorId = doctorId;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println(name + " (Doctor) is consulting " + patient.getName() + " (Patient).");
        } else {
            System.out.println(name + " (Doctor) has not yet consulted " + patient.getName() + ".");
        }
    }

    public void showPatients() {
        System.out.println(name + " is consulting the following patients:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}