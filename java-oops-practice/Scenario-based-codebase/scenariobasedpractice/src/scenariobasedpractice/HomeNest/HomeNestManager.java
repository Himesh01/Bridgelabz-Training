package scenariobasedpractice.HomeNest;

public class HomeNestManager {
    public static void main(String[] args) {

        Device light = new Light("LIGHT-01");
        Device camera = new Camera("CAM-01");
        Device thermostat = new Thermostat("THERMO-01");
        Device lock = new Lock("LOCK-01");

        light.turnOn();
        camera.turnOn();

        System.out.println("Energy used by light in 5 hrs: " +
                light.calculateEnergy(5));

        Device[] devices = { light, camera, thermostat, lock };
        for (Device d : devices) {
            d.reset();
        }
    }
}
