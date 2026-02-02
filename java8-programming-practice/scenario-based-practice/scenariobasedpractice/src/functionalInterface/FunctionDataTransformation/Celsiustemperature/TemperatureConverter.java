package functionalInterface.FunctionDataTransformation.Celsiustemperature;

import java.util.function.Function;

public class TemperatureConverter {
	public static void main(String[] args) {

        Function<Double, Double> celsiusToFahrenheit =
                c -> (c * 9 / 5) + 32;

        double tempC = 30.0;

        System.out.println(tempC + "°C in Fahrenheit: " +
                celsiusToFahrenheit.apply(tempC));
    }
}
