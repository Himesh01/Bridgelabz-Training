package com.hashmap.twosum;

public class TwoSumMain {
	public static void main(String[] args) {
		int[] nums= {2,7,12,15};
		int target = 19;
		
		TwoSum solution = new TwoSum();
		int[] result = solution.twoSum(nums,target);
		System.out.println("Indices:" +result[0] +","+ result[1]);
	}
}
