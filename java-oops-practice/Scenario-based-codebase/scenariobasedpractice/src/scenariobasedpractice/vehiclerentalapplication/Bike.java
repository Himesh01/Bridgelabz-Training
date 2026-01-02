package scenariobasedpractice.vehiclerentalapplication;

public class Bike extends Vehicle{
	public Bike(String id) { super(id, 20.0); }

    @Override
    public double calculateRent(int days) {
        return baseRate * days; // Simple calculation
    }
}
