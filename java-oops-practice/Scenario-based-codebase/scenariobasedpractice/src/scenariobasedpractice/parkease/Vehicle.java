package scenariobasedpractice.parkease;

public abstract class Vehicle implements IPayable {

    protected String vehicleNumber;
    protected double baseRate;   // per hour

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    
    @Override
    public abstract double calculateCharges(int hours);
}
