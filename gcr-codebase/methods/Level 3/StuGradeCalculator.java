import java.util.*;

public class StuGradeCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int num = sc.nextInt();
		int marks[][] = generateMarks(num);
		int total[][] = calAvgPer(marks,num);
		displayMarks(total, num);
		
	}
	
	// method for marks generation
	public static int[][] generateMarks(int num){
		int marks[][] = new int[num][3];
		
		for(int i=0;i<num;i++){
			marks[i][0] = (int)(Math.random()*99+10);
			marks[i][1] = (int)(Math.random()*99+10);
			marks[i][2] = (int)(Math.random()*99+10);
		}
		
		return marks;
	}
	
	// mwthod for average, percentage, total calculation
	public static int[][] calAvgPer(int marks[][], int n){
		int calcu[][] = new int[n][3];
		
		for(int i=0;i<n;i++){
			int total = marks[i][0]+marks[i][1]+marks[i][2];
			calcu[i][0] = Math.round(total);
			calcu[i][1] = Math.round(total/3);
			calcu[i][2] = Math.round(total/3);
		}
		return calcu;
	}
	
	//Method to display the scorecard
	public static void displayMarks(int total[][],int n){
		for(int i=0;i<n;i++)
			System.out.println("Total marks obtained by student "+total[i][0]+" Average marks: "+total[i][1]+" Percentage of student: "+total[i][2]);
	}
}