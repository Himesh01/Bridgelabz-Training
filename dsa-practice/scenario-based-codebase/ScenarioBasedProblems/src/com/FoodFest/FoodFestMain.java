package com.FoodFest;

public class FoodFestMain {

	public static void main(String[] args) {

		Stall[] stalls = {new Stall("BakeNShake", 45), new Stall("EatSpicy", 31), new Stall("FirstEat", 78)};
		MergeSort.mergeSort(stalls, 0, stalls.length - 1);
		
		for(Stall stall: stalls) {
			System.out.println(stall.name + " - " + stall.noOfEngagement);
		}
	}

}