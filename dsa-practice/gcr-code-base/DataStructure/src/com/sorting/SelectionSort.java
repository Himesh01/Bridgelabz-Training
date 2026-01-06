package com.sorting;
import java.util.*;

public class SelectionSort {
	public static void selectionSort(int [] score) {
		int n = score.length;
		
		for(int i =0; i<n-1;i++) {
			int minIndex = i;
			
			for(int j = i+1; j<n; j++) {
				if(score[j]	< score[minIndex]) {
					minIndex =j;
				}
			}
			int temp = score[minIndex];
			score[minIndex]  = score[i];
			score[i]  =temp;
		}
	}
	
	public static void main(String[] args) {
		int[] examScore = {54,89,91,45,63};
		
		System.out.println("Exam Scores before Sorting: "+ Arrays.toString(examScore));
		selectionSort(examScore);
		System.out.println("Exam Scores after Sorting: "+ Arrays.toString(examScore));
	}
}
