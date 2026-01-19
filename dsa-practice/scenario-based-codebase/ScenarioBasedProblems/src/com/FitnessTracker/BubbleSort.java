package com.FitnessTracker;

public class BubbleSort {
	public void bubbleSort(Person[] arr, int n) {
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].steps > arr[j + 1].steps) {
                    // Swap arr[j] and arr[j+1]
                    Person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: Stop if no swaps occurred
        }
	}
}
