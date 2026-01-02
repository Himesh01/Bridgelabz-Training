package scenariobasedpractice.hospitalmanagement;

import java.util.*;

public class Doctor {
	private String name;
    private String specialty;
    private List<Patient> assignedPatients;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.assignedPatients = new ArrayList<>();
    }

    public void assignPatient(Patient p) {
        assignedPatients.add(p);
        System.out.println("Patient " + p.getName() + " assigned to Dr. " + this.name);
    }

    public void showMySchedule() {
        System.out.println("\nDr. " + name + " (" + specialty + ") Patient List:");
        for (Patient p : assignedPatients) {
            p.displayInfo(); 
        }
    }
}