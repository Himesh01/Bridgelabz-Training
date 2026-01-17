package com.icecreamrush;
import java.util.*;
public class IceMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Flavour[] flavours = new Flavour[8];
		for(int i=0; i<8; i++) {
			String name;
			int soldUnit;
			System.out.print("Enter Flavour Name " + (i+1) + " : ");
			name = input.next();
			
			System.out.print("Enter Sold Unit this Week: ");
			soldUnit = input.nextInt();
			
			Flavour f = new Flavour(name, soldUnit);
			flavours[i] = f;
		}
		
		BubbleSort.bubbleSort(flavours);
		System.out.println("Sort Flavour according to popularity --------");
		for(Flavour flavour: flavours) {
			System.out.println(flavour.name + " - " + flavour.soldUnit);
		}
		
	}

}