package com.FitnessTracker;

public class Main {
	public static void main(String[] args) {
		Person[] arr = {
						new Person("Nageshwar", 5000),
						new Person("Himesh",4000),
						new Person("Lucky",3000),
						new Person("Rajeev",6000)
						};
		
		BubbleSort sort = new BubbleSort();
		sort.bubbleSort(arr, arr.length);
		
		for(Person i: arr)
			System.out.println(i.toString());
	}
}
