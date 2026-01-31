package functionalInterface.defaultinterfacemethod.smartvehicledashboard;

public class BMW implements Vehicle{
	
	@Override
	public void displaySpeed() {
		System.out.println("BMW is running with 220km/h");
	}

}
