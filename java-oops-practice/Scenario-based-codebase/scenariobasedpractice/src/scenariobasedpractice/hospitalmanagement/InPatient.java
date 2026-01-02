package scenariobasedpractice.hospitalmanagement;

public class InPatient extends Patient{
	private int roomNumber;

    public InPatient(String id, String name, int roomNumber) {
        super(id, name);
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("[InPatient] Name: " + getName() + " | Room: " + roomNumber);
    }

}