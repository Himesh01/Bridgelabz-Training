package scenariobasedpractice.smarthome;

public class Light extends Appliance implements Controllable{
	private int brightness;

    public Light(String id) {
        super(id, 15.0); 
        this.brightness = 100;
    }

    @Override
    public void turnOn() {
        setPowerState(true);
        System.out.println("Light [" + getDeviceId() + "] glowing at " + brightness + "%.");
    }

    @Override
    public void turnOff() {
        setPowerState(false);
        System.out.println("Light [" + getDeviceId() + "] turned off.");
    }

    @Override
    public void showStatus() {
        System.out.println("Device: Light | Status: " + (isDeviceOn() ? "ON" : "OFF"));
    }
}
