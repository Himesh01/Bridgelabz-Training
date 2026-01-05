package com.hashmap.subsequnce;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveFinder {

    public SequenceResult findLongestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new SequenceResult(0);
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // start only if num is the beginning
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }
        return new SequenceResult(longest);
    }
}
