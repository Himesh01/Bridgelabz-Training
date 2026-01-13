package scenariobasedpractice.HomeNest;

class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId, 0.2);
    }

    @Override
    public void reset() {
        setStatus(false);
        System.out.println("Lock " + deviceId + " reset: Recalibrated.");
    }
}
