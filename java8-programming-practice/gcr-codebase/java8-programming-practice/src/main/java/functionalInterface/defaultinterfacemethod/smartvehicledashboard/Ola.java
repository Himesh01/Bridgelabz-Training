package functionalInterface.defaultinterfacemethod.smartvehicledashboard;

public class Ola implements Vehicle{

	@Override
	public void displaySpeed() {
		// TODO Auto-generated method stub
		System.out.println("Ola max speed is 120 km/h");
	}
	
	@Override
	public void displayBattery(int battery) {
		System.out.println("your vehicle battery percentage is: "+battery+"%");
	}

}
