package functionalInterface.DefiningandImplementingInterfaces.VehicleRental;

public class Main {
	public static void main(String[] args) {
		Cars bmw = new Cars(1000, "BMW");
		
		System.out.println("Car rent: "+bmw.rent());
		System.out.println("Car type: "+bmw.returnVehicle()+"\n");
		
		Bikes apache = new Bikes(200, "Apache");
		System.out.println("Bike rent: "+apache.rent());
		System.out.println("Bike type: "+apache.returnVehicle()+"\n");
		
		Buses volvo = new Buses(250, "Volvo");
		System.out.println("Bus rent: "+volvo.rent());
		System.out.println("Bus type: "+volvo.returnVehicle());
	}
}