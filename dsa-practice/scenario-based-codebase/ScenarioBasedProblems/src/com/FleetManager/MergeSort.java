package com.FleetManager;

public class MergeSort {

	public static void mergeSort(Vehicle[] vehicles, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			
			mergeSort(vehicles, left, mid);
			mergeSort(vehicles, mid+1, right);
			
			merge(vehicles, left, mid, right);
		}
	}
	
	public static void merge(Vehicle[] vehicles, int left, int mid, int right) {
		
		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		Vehicle[] L = new Vehicle[size1];
		Vehicle[] R = new Vehicle[size2];
		
		for(int i=0; i<size1; i++)
			L[i] = vehicles[left + i];
		
		for(int j=0; j<size2; j++)
			R[j] = vehicles[mid + 1 + j];
		
		int i = 0, j = 0, k = left;
		
		while(i < size1 && j < size2) {
			if(L[i].mileage <= R[j].mileage) {
				vehicles[k] = L[i];
				i++;
			}
			else {
				vehicles[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < size1) {
			vehicles[k++] = L[i++];
		}
		
		while(j < size2) {
			vehicles[k++] = R[j++];
		}
	}
}