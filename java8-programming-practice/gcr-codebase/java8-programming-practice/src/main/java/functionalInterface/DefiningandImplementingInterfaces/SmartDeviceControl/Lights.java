package functionalInterface.DefiningandImplementingInterfaces.SmartDeviceControl;

public class Lights implements Device{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Light is turned on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Light is turned off");
	}
	
}