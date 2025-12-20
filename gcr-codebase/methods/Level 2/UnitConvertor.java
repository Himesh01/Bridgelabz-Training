import java.util.*;
public class UnitConvertor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		double miles = sc.nextDouble();
		double meter = sc.nextDouble();
		double feet = sc.nextDouble();
		
		System.out.println("km to miles "+convertKmToMiles(km));
		System.out.println("miles to km "+convertMilesToKm(miles));
		System.out.println("meter to feet "+convertMeterToFeet(meter));
		System.out.println("feet to meter "+convertFeetToMeter(feet));
		
	}
	public static double convertKmToMiles(double km){
		return km*0.621371;
	
	}
	public static double convertMilesToKm(double m){
		return m*1.60934;
	
	}
	public static double convertMeterToFeet(double m){
		return m*3.28084;
	
	}
	public static double convertFeetToMeter(double f){
		return f*0.3048;
	
	}
}