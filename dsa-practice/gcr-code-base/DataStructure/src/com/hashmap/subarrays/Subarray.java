package com.hashmap.subarrays;

public class Subarray {
	int start;
    int end;

    public Subarray(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "(" + start + ", " + end + ")";
    }
}
