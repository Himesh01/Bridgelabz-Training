package com.bridgelabz.oops.relationship;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private int patientId;
    private List<Doctor> doctors;

    public Patient(String name, int patientId) {
        this.name = name;
        this.patientId = patientId;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPatientId() {
        return patientId;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void consult(Doctor doctor) {
        if (doctors.contains(doctor)) {
            System.out.println(name + " (Patient) is consulting " + doctor.getName() + " (Doctor).");
        } else {
            System.out.println(name + " (Patient) is not consulting " + doctor.getName() + ".");
        }
    }

    public void showDoctors() {
        System.out.println(name + " is consulting the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }
    }
}