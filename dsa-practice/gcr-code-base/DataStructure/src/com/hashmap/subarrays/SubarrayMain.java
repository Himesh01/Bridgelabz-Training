package com.hashmap.subarrays;

import java.util.*;
public class SubarrayMain {
	public static void main(String[] args) {

        int[] arr = {3, 4, -7, 1, 3, -4, -2, -2};

        ZeroSumSubarrayFinder finder = new ZeroSumSubarrayFinder();
        List<Subarray> subarrays = finder.findZeroSumSubarrays(arr);

        System.out.println("Zero sum subarrays:");
        for (Subarray s : subarrays) {
            System.out.println(s);
        }
    }
}
