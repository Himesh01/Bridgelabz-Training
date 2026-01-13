package scenariobasedpractice.HomeNest;

abstract class Device implements IControllable {
    protected String deviceId;
    private boolean status;
    protected double energyUsage;

    protected String firmwareVersion;
    private String firmwareUpdateLog;

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareVersion = "v1.0";
        logFirmwareUpdate("Initial installation");
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(deviceId + " turned OFF");
    }

    public double calculateEnergy(int hours) {
        return energyUsage * hours;
    }

    private void logFirmwareUpdate(String message) {
        firmwareUpdateLog = "Firmware Log: " + message;
    }

    protected void updateFirmware(String version) {
        firmwareVersion = version;
        logFirmwareUpdate("Updated to " + version);
    }

    public abstract void reset();
}
