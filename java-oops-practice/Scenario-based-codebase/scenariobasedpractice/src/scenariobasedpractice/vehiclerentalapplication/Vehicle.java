package scenariobasedpractice.vehiclerentalapplication;

public abstract class Vehicle implements Rentable {
	private String vehicleID;
    protected double baseRate; // Accessible by subclasses

    public Vehicle(String vehicleID, double baseRate) {
        this.vehicleID = vehicleID;
        this.baseRate = baseRate;
    }

    // Encapsulation: Getters and Setters
    public String getVehicleID() { return vehicleID; }
    public void setVehicleID(String vehicleID) { this.vehicleID = vehicleID; }
}