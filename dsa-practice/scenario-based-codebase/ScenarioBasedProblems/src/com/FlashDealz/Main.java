package com.FlashDealz;

public class Main {

	public static void main(String[] args) {
		Product[] arr= new Product[5];
		
		arr[0] = new Product("laptop",20);
		arr[1] = new Product("mobile", 10);
		arr[2] = new Product("Car", 35);
		arr[3] = new Product("Charger", 5);
		arr[4] = new Product("Gaming setup", 25);
		
		QuickSort sort = new QuickSort();
		
		sort.quickSort(arr, 0, 4);
		
		for(Product i: arr) {
			System.out.println(i.toString());
		}
	}
}