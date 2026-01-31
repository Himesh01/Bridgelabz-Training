package functionalInterface.DefiningandImplementingInterfaces.VehicleRental;

public class Buses implements Vehicle{
	public double vehicleRent;
	public String name;
	
	public Buses(double vehicleRent, String name) {
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