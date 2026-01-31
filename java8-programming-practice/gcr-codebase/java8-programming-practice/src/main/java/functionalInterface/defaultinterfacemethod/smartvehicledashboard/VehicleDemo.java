package functionalInterface.defaultinterfacemethod.smartvehicledashboard;

public class VehicleDemo {
	public static void main(String[] args) {
		BMW bmw = new BMW();
		
		bmw.displaySpeed();
		
		Ola ola = new Ola();
		ola.displaySpeed();
		ola.displayBattery(80);
	}
}
