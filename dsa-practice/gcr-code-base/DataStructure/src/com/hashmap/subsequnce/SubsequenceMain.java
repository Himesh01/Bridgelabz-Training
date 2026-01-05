package com.hashmap.subsequnce;

public class SubsequenceMain {
    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        LongestConsecutiveFinder finder = new LongestConsecutiveFinder();
        SequenceResult result = finder.findLongestConsecutive(nums);

        System.out.println(result);
    }
}
