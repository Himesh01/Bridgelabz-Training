package com.smartlibrary;

public class InsertionSort {
	
	public static void insertionSort(Book[] books) {
		
		int n = books.length;
		for(int i=0; i<n; i++) {
			Book curr = books[i];
			int j = i-1;
			
			while(j >= 0 && books[j].name.compareTo(curr.name) > 0) {
				books[j + 1] = books[j];
				j--;
			}
			
			books[j+1] = curr;
		}
	}
}