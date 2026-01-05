package com.hashmap.subarrays;
import java.util.*;

public class ZeroSumSubarrayFinder {

    public List<Subarray> findZeroSumSubarrays(int[] arr) {
        List<Subarray> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        //sum 0 at index -1
        map.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    result.add(new Subarray(startIndex + 1, i));
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }
}
