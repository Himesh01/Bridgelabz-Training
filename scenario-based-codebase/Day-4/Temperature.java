/*
11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.*;

public class Temperature{
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		int days =7;
		double[] arr = new double[days];
		
		System.out.println("Enter temperature of 7 days");
		for(int i= 0; i<days; i++){
			arr[i] = sc.nextDouble();
		}
		System.out.println("Temperature of 7 days is ");
		for(int i = 0; i<days; i++){
			System.out.print(arr[i] + ",");
		}
		
		double averageTemperature = averageTemp(arr);
		System.out.println("\nAverage temperature over 7 days: " + averageTemperature);
		
		double maxTemperature = maxTemp(arr);
		System.out.println("Maximum temperature recorded: " + maxTemperature);
		
		
	}
	public static double averageTemp(double[] arr){
		double sum =0;
		
		for(int i =0;i<arr.length;i++){
			sum +=arr[i];
		}
		return sum/arr.length;
	}
	
	public static double maxTemp(double[] arr){
		double max = arr[0];
		
		for(int i = 1; i<arr.length; i++){
			if(arr[i]> max){
				max = arr[i];
			}
		}
		return max;
	}
}
		