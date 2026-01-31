package functionalInterface.DefiningandImplementingInterfaces.SmartDeviceControl;

public class Main {
	public static void main(String[] args) {
		
		Ac ac = new Ac();
		ac.turnOn();
		ac.turnOff();
		
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		
		Lights light = new Lights();
		light.turnOn();
		light.turnOff();
	}
}