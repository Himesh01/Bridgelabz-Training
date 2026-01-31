package functionalInterface.temperatureAlertsystem;

import java.util.function.*;

public class TemperatureAlert {
	public static void main(String[] args) {
		
		double threashold = 38.0;
		
		Predicate<Double> isHighTemperature = temp-> temp> threashold;
		
		double[] readings = {36.5, 37.2, 38.5, 39.1};

        for (double temp : readings) {
            if (isHighTemperature.test(temp)) {
                System.out.println("ALERT! High temperature: " + temp + "°C");
            } else {
                System.out.println("Normal temperature: " + temp + "°C");
            }
        }
	}
}
