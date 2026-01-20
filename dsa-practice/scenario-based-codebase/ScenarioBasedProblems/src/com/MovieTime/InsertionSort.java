package com.MovieTime;

public class InsertionSort {
public static void insertionSort(Show[] shows) {
		
		int n = shows.length;
		for(int i=1; i<n; i++) {
			Show curr = shows[i];
			int j = i-1;
			
			while(j >= 0 && shows[j].showTime.compareTo(curr.showTime) > 0) {
				shows[j+1] = shows[j];
				j--;
			}
			
			shows[j+1] = curr;
		}
	}
}
