package functionalInterface.DefiningandImplementingInterfaces.VehicleRental;

public class Bikes implements Vehicle{
	public double vehicleRent;
	public String name;
	
	public Bikes(double vehicleRent, String name) {
		this.vehicleRent = vehicleRent;
		this.name = name;
	}

	@Override
	public double rent() {
		// TODO Auto-generated method stub
		return vehicleRent;
	}

	@Override
	public String returnVehicle() {
		// TODO Auto-generated method stub
		return name;
	}
}