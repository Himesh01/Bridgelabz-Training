package streamApi.IoTSensorReadings;
import java.util.List;

public class IotMonitor {
    public static void main(String[] args) {
        double threshold = 75.0;

        List<SensorReading> readings = List.of(
            new SensorReading("Temp-01", 72.5),
            new SensorReading("Temp-02", 81.2),
            new SensorReading("Temp-03", 68.9),
            new SensorReading("Temp-04", 95.4)
        );

        System.out.println("Alert: High Sensor Readings Detected!");

        readings.stream()
            .filter(r -> r.getValue() > threshold)
            .forEach(r -> System.out.println("ALERT [" + r.getSensorId() + "]: " + r.getValue()));
    }
}
