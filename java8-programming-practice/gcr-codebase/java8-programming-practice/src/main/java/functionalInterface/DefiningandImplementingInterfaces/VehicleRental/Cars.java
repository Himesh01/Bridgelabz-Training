package functionalInterface.DefiningandImplementingInterfaces.VehicleRental;

public class Cars implements Vehicle{
	public double vehicleRent;
	public String name;
	
	public Cars(double rent, String name) {
		this.vehicleRent = rent;
		this.name = name;
	}
	
	public double rent() {
		return vehicleRent;
	}
	public String returnVehicle() {
		return name;
	}
}