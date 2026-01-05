package com.sorting;
import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {63,12, 11, 4, 25, 39, 5, 6, 3};
		System.out.println("Array befor sorting: "+Arrays.toString(arr));
		
		quickSort(arr, 0, arr.length-1);
		System.out.println("Array after sorting: "+ Arrays.toString(arr));
	}
	
	public static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j =low; j<high; j++) {
			if(arr[j]<pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
}
