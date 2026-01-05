package com.stackqueue.slidingwindow;
import java.util.*;

public class SlidingWindowMAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
		 int k = 3;

		 int[] output = maxSlidingWindow(nums, k);

		 System.out.println("Input: " + Arrays.toString(nums));
		 System.out.println("Window Size: " + k);
		 System.out.println("Result: " + Arrays.toString(output));
	}
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k <= 0) 
			return new int[0];
	        
		int n = nums.length;
		int[] result = new int[n - k + 1];
		int ri = 0;
	        
		Deque deque = new Deque();

		for (int i = 0; i < n; i++) {
			// Remove indices that are out of window range
			if (!deque.isEmpty() && deque.peekFirst() == i - k) {
				deque.removeFirst();
			}

			// Remove indices of all elements smaller than current element
			// (Maintaining monotonic decreasing order)
			while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
				deque.removeLast();
			}

			// Add current element index
			deque.addLast(i);

			// Add the maximum (at the front) to our result
			if (i >= k - 1) {
				result[ri++] = nums[deque.peekFirst()];
			}
		}
		return result;
	}
}
