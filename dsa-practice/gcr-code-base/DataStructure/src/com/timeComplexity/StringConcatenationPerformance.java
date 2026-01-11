package com.timeComplexity;

public class StringConcatenationPerformance {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        for (int n : sizes) {
            System.out.println("Operations Count: " + n);

            // String 
            if (n <= 10000) { 
                long start = System.nanoTime();
                String s = "";
                for (int i = 0; i < n; i++) {
                    s = s + "a";
                }
                long end = System.nanoTime();
                System.out.println("String Time: " +
                        (end - start) / 1_000_000.0 + " ms");
            } else {
                System.out.println("String Time: Unusable (O(N²))");
            }

            // StringBuilder
            long startSB = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append("a");
            }
            long endSB = System.nanoTime();
            System.out.println("StringBuilder Time: " +(endSB - startSB) / 1_000_000.0 + " ms");

            // StringBuffer 
            long startSBF = System.nanoTime();
            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < n; i++) {
                sbf.append("a");
            }
            long endSBF = System.nanoTime();
            System.out.println("StringBuffer Time: " +(endSBF - startSBF) / 1_000_000.0 + " ms");

            System.out.println("");
        }
    }
}