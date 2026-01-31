package streamApi.IoTSensorReadings;

public class SensorReading {

    private String sensorId;
    private double value;

    public SensorReading(String sensorId, double value) {
        this.sensorId = sensorId;
        this.value = value;
    }

    public String getSensorId() { return sensorId; }
    public double getValue() { return value; }
}
