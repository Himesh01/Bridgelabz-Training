package functionalInterface.staticmethodsinInterface.unitconversiontool;

public interface UnitConverter {
	public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    public static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    public static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}
