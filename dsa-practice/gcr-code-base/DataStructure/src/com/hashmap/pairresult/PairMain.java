package com.hashmap.pairresult;

public class PairMain {
    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        PairSumChecker checker = new PairSumChecker();
        PairResult result = checker.findPair(arr, target);

        if (result != null) {
            System.out.println("Pair found: " + result);
        } else {
            System.out.println("No pair found");
        }
    }
}
