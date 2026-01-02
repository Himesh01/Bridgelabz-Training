package scenariobasedpractice.smarthome;

import java.util.ArrayList;
import java.util.List;

public class UserController {
	private List<Controllable> devices = new ArrayList<>();

    public void addDevice(Controllable device) {
        devices.add(device);
    }

    public void activateAll() {
        System.out.println("\n--- Executing 'Arrive Home' Routine ---");
        for (Controllable device : devices) {
            device.turnOn(); 
        }
    }

    public void deactivateAll() {
        System.out.println("\n--- Executing 'Leave Home' Routine ---");
        for (Controllable device : devices) {
            device.turnOff();
        }
    }
}
