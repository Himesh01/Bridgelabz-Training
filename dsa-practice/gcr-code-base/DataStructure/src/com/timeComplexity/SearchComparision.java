package com.timeComplexity;
import java.util.*;

public class SearchComparision {
	public static int linearSearch(int[] arr, int target) {
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i] == target)
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		while(left <= right) {
			int mid = (left + right)/2;
			
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] < target)
				left = mid+1;
			else
				right = mid-1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int N = 1_000_000;
		int[] data = new int[N];
		
		for(int i =0; i<N; i++) {
			data[i] = i;
		}
		int target = N-1;
		
		long startLinear = System.nanoTime();
		linearSearch(data, target);
		
		long endLinear = System.nanoTime();
		Arrays.sort(data);
		
		long startBinary = System.nanoTime();
		binarySearch(data,target);
		
		long endBinary = System.nanoTime();
		
		double linearTime  =(endLinear - startLinear )/1_000_000;
		double binaryTime =(endBinary - startBinary)/1_000_000;
		
		System.out.println("Dataset Size: "+ N);
		System.out.println("Linear Search Time" + linearTime +"ms");
		System.out.println("Binary Search Time" + binaryTime +"ms");
		
		System.out.println("Binary Search performs much better for large datasets, provided data is sorted.");
	}
}
















