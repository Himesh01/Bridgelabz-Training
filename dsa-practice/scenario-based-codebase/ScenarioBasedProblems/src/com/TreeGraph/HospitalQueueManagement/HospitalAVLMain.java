package com.TreeGraph.HospitalQueueManagement;

public class HospitalAVLMain {

    public static void main(String[] args) {

        HospitalAVL hospital = new HospitalAVL();

        hospital.registerPatient(930, "Nag");
        hospital.registerPatient(1015, "Raj");
        hospital.registerPatient(845, "Himesh");
        hospital.registerPatient(1100, "Lucky");
        hospital.registerPatient(900, "Rajeev");

        hospital.displayPatients();

        System.out.println("\n Discharging patient checked-in at 900");
        hospital.dischargePatient(900);

        hospital.displayPatients();
    }
}