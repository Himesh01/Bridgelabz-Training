package com.hashmap.pairresult;

import java.util.HashMap;
import java.util.Map;

public class PairSumChecker {

    public PairResult findPair(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                return new PairResult(complement, num);
            }
            map.put(num, 1); // store visited number
        }
        return null; // no pair found
    }
}

