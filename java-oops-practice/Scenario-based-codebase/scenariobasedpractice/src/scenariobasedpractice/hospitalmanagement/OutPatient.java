package scenariobasedpractice.hospitalmanagement;

public class OutPatient extends Patient{
	private String appointmentTime;

    public OutPatient(String id, String name, String appointmentTime) {
        super(id, name, "Regular Checkup"); 
        this.appointmentTime = appointmentTime;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Out-Patient] Name: " + getName() + " | Appointment: " + appointmentTime);
    }
}
