package scenariobasedpractice.vehiclerentalapplication;

public class Car extends Vehicle {
    public Car(String id) { super(id, 50.0); }

    @Override
    public double calculateRent(int days) {
        double insurance = 10.0 * days;
        return (baseRate * days) + insurance; // Base + Insurance operator
    }
}