import java.util.*;
public class UnitConvertor2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Four Values");
		double yards = sc.nextDouble();
		double feet = sc.nextDouble();
		double meter= sc.nextDouble();
		double inche = sc.nextDouble();
		
		System.out.println("The yard to feet "+convertYardsToFeet(yards));
		System.out.println("The feet to yard "+convertFeetToYard(feet));
		System.out.println("The meter to inches "+convertMeterToInches(meter));
		System.out.println("The inches to meter "+convertInchesToMeter(inche));
		System.out.println("The inches to centimeter "+convertInchesToCentimeter(inche));
		
	}
	public static double convertYardsToFeet(double yards){
		return yards*3;
	}
	public static double convertFeetToYard(double feet){
		return feet*0.333333;
	}
	public static double convertMeterToInches(double meters){
		return meters*39.3701;
	}
	public static double convertInchesToMeter(double inches){
		return inches*0.0254;
	}
	public static double convertInchesToCentimeter(double inches){
		return inches*2.54;
	}
}