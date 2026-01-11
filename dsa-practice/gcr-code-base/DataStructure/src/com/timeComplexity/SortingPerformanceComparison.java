package com.timeComplexity;
import java.util.Random;

public class SortingPerformanceComparison {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 100000};

        for (int size : sizes) {

            System.out.println("Dataset Size: " + size);

            int[] arr1 = generateArray(size);
            int[] arr2 = arr1.clone();
            int[] arr3 = arr1.clone();

            // Bubble Sort 
            if (size <= 10000) {
                long start = System.nanoTime();
                bubbleSort(arr1);
                long end = System.nanoTime();
                System.out.println("Bubble Sort Time: " +
                        (end - start) / 1_000_000.0 + " ms");
            } else {
                System.out.println("Bubble Sort Time: Unfeasible");
            }

            // Merge Sort
            long startMerge = System.nanoTime();
            mergeSort(arr2, 0, arr2.length - 1);
            long endMerge = System.nanoTime();
            System.out.println("Merge Sort Time: " +
                    (endMerge - startMerge) / 1_000_000.0 + " ms");

            // Quick Sort
            long startQuick = System.nanoTime();
            quickSort(arr3, 0, arr3.length - 1);
            long endQuick = System.nanoTime();
            System.out.println("Quick Sort Time: " +(endQuick - startQuick) / 1_000_000.0 + " ms");

            System.out.println("");
        }
    }
}