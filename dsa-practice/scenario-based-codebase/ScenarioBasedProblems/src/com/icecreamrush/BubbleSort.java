package com.icecreamrush;

public class BubbleSort {

	public static void bubbleSort(Flavour[] flavours) {
		int n = flavours.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(flavours[j].soldUnit <= flavours[j + 1].soldUnit) {
					Flavour temp = flavours[j];
					flavours[j] = flavours[j + 1];
					flavours[j + 1] = temp;
				}
			}
		}
	}
}