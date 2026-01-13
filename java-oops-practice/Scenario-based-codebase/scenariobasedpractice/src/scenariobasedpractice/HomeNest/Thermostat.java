package scenariobasedpractice.HomeNest;

class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId, 2.0);
    }

    @Override
    public void reset() {
        setStatus(false);
        System.out.println("Thermostat " + deviceId + " reset: Temp set to 24°C.");
    }
}
