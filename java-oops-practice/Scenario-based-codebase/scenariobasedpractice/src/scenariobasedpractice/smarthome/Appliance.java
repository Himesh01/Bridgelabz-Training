package scenariobasedpractice.smarthome;

public abstract class Appliance {
	private String deviceId;
    private boolean isOn;
    protected double powerConsumption; 
    
    public Appliance(String deviceId, double powerConsumption) {
        this.deviceId = deviceId;
        this.powerConsumption = powerConsumption;
        this.isOn = false; 
    }

    public boolean isDeviceOn() { return isOn; }
    protected void setPowerState(boolean state) { this.isOn = state; }
    public String getDeviceId() { return deviceId; }

    public abstract void showStatus();
}