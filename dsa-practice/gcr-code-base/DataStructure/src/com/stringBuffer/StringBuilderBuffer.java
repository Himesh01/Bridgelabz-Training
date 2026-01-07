package com.stringBuffer;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        int iterations = 1_000_000;

        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("hello");
        }

        long endTimeBuffer = System.nanoTime();
        long bufferTime = endTimeBuffer - startTimeBuffer;

        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("hello");
        }

        long endTimeBuilder = System.nanoTime();
        long builderTime = endTimeBuilder - startTimeBuilder;

        System.out.println("Time taken by StringBuffer (nanoseconds): " + bufferTime);
        System.out.println("Time taken by StringBuilder (nanoseconds): " + builderTime);
    }
}
