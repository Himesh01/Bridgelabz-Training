package scenariobasedpractice.smarthome;

public class SmartHomeSystem {
	public static void main(String[] args) {
        
        UserController homeHub = new UserController();

        homeHub.addDevice(new Light("LivingRoom_L1"));
        homeHub.addDevice(new AC("Bedroom_AC", 22));

        homeHub.activateAll();

        AC myAc = new AC("Guest_AC", 24);
        myAc.showStatus();
    }
}