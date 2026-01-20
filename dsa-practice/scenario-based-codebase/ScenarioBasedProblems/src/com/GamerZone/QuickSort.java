package com.GamerZone;

public class QuickSort {

	public static void quickSort(Player[] players, int low, int high) {
		if(low < high) {
			int pivotIdx = partition(players, low, high);
			
			quickSort(players, low, pivotIdx-1);
			quickSort(players, pivotIdx+1, high);
		}
	}
	
	public static int partition(Player[] players, int low, int high) {
		Player pivot = players[high];
		int i = low-1;
		
		for(int j=low; j<high; j++) {
			if(players[j].score > pivot.score) {
				i++;
				
				Player temp = players[i];
				players[i] = players[j];
				players[j] = temp;
			}
		}
		
		Player temp = players[i+1];
		players[i+1] = players[high];
		players[high] = temp;
		
		return i+1;
	}
}