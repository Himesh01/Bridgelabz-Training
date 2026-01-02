package scenariobasedpractice.hospitalmanagement;

public abstract class Patient {
	private String patientId;
    private String name;
    private String medicalHistory; 

    public Patient(String patientId, String name, String history) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = history;
    }

    public Patient(String patientId, String name) {
        this(patientId, name, "Emergency - Pending Diagnosis");
    }

    public String getName() { return name; }
    
    public String getSummary() {
        return "[ID: " + patientId + "] Patient: " + name + " | History: " + medicalHistory;
    }

    public abstract void displayInfo();
}
