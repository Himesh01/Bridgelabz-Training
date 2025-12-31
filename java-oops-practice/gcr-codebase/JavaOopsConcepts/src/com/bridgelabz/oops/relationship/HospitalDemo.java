package com.bridgelabz.oops.relationship;

public class HospitalDemo {
    public static void main(String[] args) {
        // Create Hospital
        Hospital hospital = new Hospital("JeevanDan Hospital");

        // Create Doctors
        Doctor doctor1 = new Doctor("Dr. Himesh", 101);
        Doctor doctor2 = new Doctor("Dr. Rajeev", 102);

        // Create Patients
        Patient patient1 = new Patient("Nag", 201);
        Patient patient2 = new Patient("Lucky", 202);

        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Add patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Create relationships between doctors and patients
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient2);

        patient1.addDoctor(doctor1);
        patient2.addDoctor(doctor1);
        patient2.addDoctor(doctor2);

        // Consultations
        doctor1.consult(patient1);
        doctor2.consult(patient2);
        patient1.consult(doctor1);
        patient2.consult(doctor2);

        // Show doctors and patients
        hospital.showDoctorsAndPatients();
    }
}