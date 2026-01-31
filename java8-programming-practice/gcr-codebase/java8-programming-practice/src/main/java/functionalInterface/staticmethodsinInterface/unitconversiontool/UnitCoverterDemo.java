package functionalInterface.staticmethodsinInterface.unitconversiontool;

public class UnitCoverterDemo {
	public static void main(String[] args) {

        double distanceKm = 120;
        double weightKg = 50;

        System.out.println(distanceKm + " km = "
                + UnitConverter.kmToMiles(distanceKm) + " miles");

        System.out.println(weightKg + " kg = "
                + UnitConverter.kgToLbs(weightKg) + " lbs");
    }
}
