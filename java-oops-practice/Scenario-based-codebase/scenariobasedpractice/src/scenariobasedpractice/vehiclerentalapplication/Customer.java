package scenariobasedpractice.vehiclerentalapplication;

public class Customer {
    private String name;
    private Vehicle rentedVehicle;

    public Customer(String name) { this.name = name; }

    public void rentVehicle(Vehicle vehicle) {
        this.rentedVehicle = vehicle;
    }

    public void displayRentalInvoice(int days) {
        System.out.println("Customer: " + name);
        System.out.println("Vehicle ID: " + rentedVehicle.getVehicleID());
        System.out.println("Total Rent: $" + rentedVehicle.calculateRent(days));
    }
}