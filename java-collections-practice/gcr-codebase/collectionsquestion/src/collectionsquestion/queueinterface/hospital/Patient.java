package collectionsquestion.queueinterface.hospital;


public class Patient {
    private String name;
    private int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}