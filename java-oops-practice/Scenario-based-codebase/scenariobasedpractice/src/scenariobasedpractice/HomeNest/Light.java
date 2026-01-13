package scenariobasedpractice.HomeNest;

class Light extends Device {

    public Light(String deviceId) {
        super(deviceId, 0.5);
    }

    @Override
    public void reset() {
        setStatus(false);
        System.out.println("Light " + deviceId + " reset: Brightness set to default.");
    }
}
