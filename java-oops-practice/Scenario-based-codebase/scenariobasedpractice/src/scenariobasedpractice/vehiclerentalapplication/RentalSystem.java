package scenariobasedpractice.vehiclerentalapplication;

public class RentalSystem {
	public static void main(String[] args) {
        Customer client1 = new Customer("Himesh Kurmi");
        Customer client2 = new Customer("Bunty Bhai");

        Vehicle myCar = new Car("Ford Mustang Shelby");
        Vehicle myTruck = new Truck("Volvo-XC900");

        client1.rentVehicle(myCar);
        client1.displayRentalInvoice(5);

        client2.rentVehicle(myTruck);
        client2.displayRentalInvoice(3);
	}
}
