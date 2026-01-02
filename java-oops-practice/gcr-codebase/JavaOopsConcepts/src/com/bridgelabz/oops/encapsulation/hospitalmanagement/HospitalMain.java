package com.bridgelabz.oops.encapsulation.hospitalmanagement;
import java.util.ArrayList;

public class HospitalMain {

	public static void main(String[] args) {

		ArrayList<Patient> patients = new ArrayList<>();

		InPatient inPatient = new InPatient(1, "Rajeev", 45, 5, 2000);
		inPatient.addRecord("Diabetes");
		inPatient.addRecord("Blood Test");

		OutPatient outPatient = new OutPatient(2, "Monika", 30, 800);
		outPatient.addRecord("Fever");
		outPatient.addRecord("X-Ray");

		patients.add(inPatient);
		patients.add(outPatient);

		HospitalService.processPatients(patients);

		// View medical records
		inPatient.viewRecords();
		outPatient.viewRecords();
	}
}