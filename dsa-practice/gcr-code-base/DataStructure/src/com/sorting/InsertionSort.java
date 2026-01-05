package com.sorting;
import java.util.*;

public class InsertionSort {

		public static void insertionSort(int arr[]) {
			for(int  i = 1 ;i<arr.length; i++) {
				int key = arr[i];
				int j = i-1;
				
				while(j>=0 && arr[j] > key) {
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1] = key;
			}
		}
		public static void main(String[] args) {
			int arr[] = {3,2, 1, 4, 5, 39, 5, 6, 3};
			System.out.println("Array befor sorting: "+Arrays.toString(arr));
			
			insertionSort(arr);
			System.out.println("Array after sorting: "+ Arrays.toString(arr));
		}
}

