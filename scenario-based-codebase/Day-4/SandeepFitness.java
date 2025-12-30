/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.Scanner;

public class SandeepFitness
{
    public static void fitnessTracker(){
		Scanner sc = new Scanner(System.in);
		int[] pushupCount = new int[7];
		int curr = 0;
		int total = 0;

		while(true){
			if(curr == pushupCount.length){
			
				System.out.println("------Sandeep Fitness Track for Week---------");
				System.out.println("Total Pushups count : " + total);
				System.out.println("Average Pushup count: " + (total/7));
				System.out.println("-----------------------------------------------");
				break;
			}

			System.out.println("Enter Pushup Count for Day " + (curr+1) + " (-1 -> for Rest day): ");
			pushupCount[curr] = sc.nextInt();
			while(pushupCount[curr] < -1){
				System.out.println("Invalid count -----------------, Enter Again");
				System.out.println("Enter Pushup Count for Day " + (curr+1) + " (-1 -> for Rest day): ");
				pushupCount[curr] = sc.nextInt();
			}
		
			if(pushupCount[curr] != -1){
				total += pushupCount[curr];
			}
			curr++;
		}
	}
	public static void main(String args[]){
		fitnessTracker();
	}
}