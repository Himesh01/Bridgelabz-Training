package functionalInterface.defaultinterfacemethod.smartvehicledashboard;

public interface Vehicle {
	
	public void displaySpeed();
	
	public default void displayBattery(int battery) {
		System.out.println("your vehicle battery percentage is: "+battery+"%");
	}
}
