package com.FlashDealz;

public class QuickSort {
	
	public void quickSort(Product[] arr, int low, int high) {
		if(low<high) {
			
			int pi = partition(arr, low, high);
			quickSort(arr, low,pi-1);
			quickSort(arr,pi+1, high);
		}
	}
	private static int partition(Product[] arr, int low, int high) {
		double pivot = arr[high].discount;
		
		int i=low-1;
		for(int j=low; j<high; j++) {
			if(arr[j].discount<pivot) {
				i++;
				Product temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		Product temp = arr[high];
		arr[high] = arr[i+1];
		arr[i+1]= temp;
		return i+1;
		}
}