package com.MovieTime;
import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of shows: ");
		n = input.nextInt();
		
		Show[] shows = new Show[n];
		
		for(int i=0; i<n; i++) {
			String showName, time;
			System.out.println("Enter Show Name: ");
			showName = input.next();
			
			System.out.println("Enter Show Time (HH:MM): ");
			time = input.next();
			
			Show temp= new Show(showName, time);
			shows[i] = temp;
		}
		
		InsertionSort.insertionSort(shows);
		for(int i=0; i<n; i++) {
			System.out.println("Show Name: " + shows[i].showTime + "   --   " + shows[i].showTime);
		}
	}

}