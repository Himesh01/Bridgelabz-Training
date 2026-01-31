package functionalInterface.DefiningandImplementingInterfaces.SmartDeviceControl;


public class TV implements Device{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV is starting");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV is turned off");
	}
	
}