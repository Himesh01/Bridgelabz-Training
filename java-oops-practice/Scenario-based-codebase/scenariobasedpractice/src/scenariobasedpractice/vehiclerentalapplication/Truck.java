package scenariobasedpractice.vehiclerentalapplication;

public class Truck extends Vehicle {
	public Truck(String id) { super(id, 100.0); }

    @Override
    public double calculateRent(int days) {
        double heavyLoadSurcharge = 50.0;
        return (baseRate * days) + heavyLoadSurcharge; // Base + Flat surcharge
    }
}
