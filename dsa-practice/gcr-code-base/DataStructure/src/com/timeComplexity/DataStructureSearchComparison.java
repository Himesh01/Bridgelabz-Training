package com.timeComplexity;

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearchComparison {

    // Linear search in array
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 100000, 1000000};

        for (int size : sizes) {

            System.out.println("Dataset Size: " + size);

            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Fill data structures
            for (int i = 0; i < size; i++) {
                array[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }

            int target = size - 1;

            //Array Search
            long startArray = System.nanoTime();
            linearSearch(array, target);
            long endArray = System.nanoTime();

            System.out.println("Array Search Time: " +(endArray - startArray) / 1_000_000.0 + " ms");

            //HashSet Search 
            long startHashSet = System.nanoTime();
            hashSet.contains(target);
            long endHashSet = System.nanoTime();

            System.out.println("HashSet Search Time: " + (endHashSet - startHashSet) / 1_000_000.0 + " ms");

            //TreeSet Search
            long startTreeSet = System.nanoTime();
            treeSet.contains(target);
            long endTreeSet = System.nanoTime();

            System.out.println("TreeSet Search Time: " +(endTreeSet - startTreeSet) / 1_000_000.0 + " ms");

            System.out.println(" ");
        }
    }
}