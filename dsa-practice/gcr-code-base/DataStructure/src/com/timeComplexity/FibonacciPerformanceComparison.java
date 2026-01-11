package com.timeComplexity;

public class FibonacciPerformanceComparison {

    // Recursive Fibonacci (Exponential Time)
    public static long fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci (Linear Time)
    public static long fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        long a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int[] testValues = {10, 30, 50};

        for (int n : testValues) {

            System.out.println("Fibonacci Number: " + n);

            // Recursive 
            if (n <= 30) { 
                long startRec = System.nanoTime();
                long recResult = fibonacciRecursive(n);
                long endRec = System.nanoTime();

                System.out.println("Recursive Result: " + recResult);
                System.out.println("Recursive Time: " +(endRec - startRec) / 1_000_000.0 + " ms");
            } else {
                System.out.println("Recursive Time: Unfeasible (O(2^N))");
            }

            // Iterative
            long startItr = System.nanoTime();
            long itrResult = fibonacciIterative(n);
            long endItr = System.nanoTime();

            System.out.println("Iterative Result: " + itrResult);
            System.out.println("Iterative Time: " + (endItr - startItr) / 1_000_000.0 + " ms");

            System.out.println("");
        }
    }
}