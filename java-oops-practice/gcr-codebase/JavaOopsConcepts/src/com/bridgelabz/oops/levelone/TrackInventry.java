package com.bridgelabz.oops.levelone;

public class TrackInventry {

	String[] itemCode;
	String[] itemName;
	double[] price;
	
	TrackInventry(String[] itemName,String[] itemCode, double[] price){
		this.itemCode  =itemCode;
		this.itemName = itemName;
		this.price =price;
	}
	
	public void displayTrackInventry(int i) {
		System.out.println("itemCode : "+itemCode[i]);
		System.out.println("itemPrice : "+price[i]);
		System.out.println("itemName : "+itemName[i]);
		
	}
	public static void main(String[] args) {
		String[] itemName = {"Water pouch", "Rice", "BlackPen"};
		String[] itemCode = {"01AA","01AB","01CB"};
		double[] price = {456,786,112};
		TrackInventry item = new TrackInventry(itemName,itemCode,price);
		
		for(int i = 0; i<price.length; i++) {
			item.displayTrackInventry(i);
		}
		
	}

}
