package com.FoodFest;

public class MergeSort {

	public static void mergeSort(Stall[] stalls, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			
			mergeSort(stalls, left, mid);
			mergeSort(stalls, mid+1, right);
			
			merge(stalls, left, mid, right);
		}
	}
	
	public static void merge(Stall[] stalls, int left, int mid, int right) {
		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		Stall[] L = new Stall[size1];
		Stall[] R = new Stall[size2];
		
		for(int i=0; i<size1; i++)
			L[i] = stalls[left + i];
		
		for(int j=0; j<size2; j++)
			R[j] = stalls[mid + j + 1];
		
		int i = 0, j = 0, k = left;
		
		while(i < size1 && j < size2) {
			if(L[i].noOfEngagement >= R[j].noOfEngagement) {
				stalls[k] = L[i];
				i++;
			}
			else {
				stalls[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < size1) {
			stalls[k++] = L[i++];
		}
		
		while(j < size2) {
			stalls[k++] = R[j++];
		}
	}
}