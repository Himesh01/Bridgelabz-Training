package java8Workshop;

@FunctionalInterface
public interface FareCalculator {
	double calculateFare(double distance, double rate);
}
