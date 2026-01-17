package com.artexpo;

public class InsertionSort {
public static void insertionSort(Artist[] artists) {
		
		int n = artists.length;
		for(int i=0; i<n; i++) {
			Artist curr = artists[i];
			int j = i-1;
			
			while(j >= 0 && artists[j].registrationTime.compareTo(curr.registrationTime) > 0) {
				artists[j + 1] = artists[j];
				j--;
			}
			artists[j+1] = curr;
		}
	}
}
