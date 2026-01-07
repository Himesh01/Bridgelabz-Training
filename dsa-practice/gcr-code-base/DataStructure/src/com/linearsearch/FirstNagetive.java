package com.linearsearch;

public class FirstNagetive {
	public static void main(String[] args) {
    	System.out.println(search(new int[] {1,2,-3,4,5,-8,8,7,-9,10}));
    }
    public static int search(int[] arr) {
    	for(int i =0;i<arr.length;i++) {
    		if(arr[i]<0) {
    			return i;
    		}
    	}
    	return -1;
    }
}
