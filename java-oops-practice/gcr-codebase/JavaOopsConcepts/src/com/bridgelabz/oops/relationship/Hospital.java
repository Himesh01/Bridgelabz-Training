package com.bridgelabz.oops.relationship;


import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void showDoctorsAndPatients() {
        System.out.println("Doctors in " + hospitalName + ":");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
            doctor.showPatients();
        }

        System.out.println("\nPatients in " + hospitalName + ":");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
            patient.showDoctors();
        }
    }
}
