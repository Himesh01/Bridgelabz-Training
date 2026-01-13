package scenariobasedpractice.HomeNest;

class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 1.2);
    }

    @Override
    public void reset() {
        setStatus(false);
        System.out.println("Camera " + deviceId + " reset: Cache cleared.");
    }
}