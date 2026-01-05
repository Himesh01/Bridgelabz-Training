package com.hashmap.pairresult;

public class PairResult {
	int first;
    int second;

    public PairResult(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
