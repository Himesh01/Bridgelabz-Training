import java.util.*;
public class WindTemperature{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the temperature : ");
		double temperature = sc.nextDouble();
		
		System.out.print("Enter the wiind speed: ");
		double windSpeed = sc.nextDouble();
			
		double windChill = calculateWindChill(temperature,windSpeed);
		
		System.out.println("the wind chill is : "+windChill);
	}
	public static double calculateWindChill(double temp, double windSpeed){
		return  35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16);
	}

}