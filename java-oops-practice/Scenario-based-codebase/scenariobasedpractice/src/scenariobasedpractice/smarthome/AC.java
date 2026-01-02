package scenariobasedpractice.smarthome;

public class AC extends Appliance implements Controllable{
	private int temperature;

    public AC(String id, int temp) {
        super(id, 2000.0); 
        this.temperature = temp;
    }

    @Override
    public void turnOn() {
        setPowerState(true);
        System.out.println("AC [" + getDeviceId() + "] cooling to " + temperature + "°C.");
    }

    @Override
    public void turnOff() {
        setPowerState(false);
        System.out.println("AC [" + getDeviceId() + "] compressor shutting down.");
    }

    @Override
    public void showStatus() {
        String energyRank = (powerConsumption > 1000) ? "High Energy" : "Low Energy";
        System.out.println("Device: AC | Rank: " + energyRank);
    }
}