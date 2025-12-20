import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		
		int marks[][] = new int[n][3];
		for(int i=0;i<n;i++){
			System.out.print("Enter maths marks: ");
			marks[i][0] = sc.nextInt();
			while(marks[i][0]<0){
				System.out.print("Enter valid marks: ");
				marks[i][0] = sc.nextInt();
			}
			System.out.print("Enter chemistry marks: ");
			marks[i][1] = sc.nextInt();
			while(marks[i][0]<0){
				System.out.print("Enter valid marks: ");
				marks[i][0] = sc.nextInt();
			}
			System.out.print("Enter physics marks: ");
			marks[i][2] = sc.nextInt();
			while(marks[i][0]<0){
				System.out.print("Enter valid marks: ");
				marks[i][0] = sc.nextInt();
			}
		}
		double percentage[] = new double[n];
		for(int i=0;i<n;i++)
			percentage[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3.0;
		
		String grades[] = new String[n];
		for(int i=0;i<n;i++){
			if(percentage[i]>=80)
				grades[i]="A";
			else if(percentage[i]>=70)
				grades[i]="B";
			else if(percentage[i]>=60)
				grades[i]="C";
			else if(percentage[i]>=50)
				grades[i]="D";
			else if(percentage[i]>=40)
				grades[i]="E";
			else
				grades[i] ="R";
		}
		
		for(int i=0;i<n;i++){
			System.out.println("Marks: "+ Arrays.toString(marks[i]));
			System.out.println("Percentages: "+percentage[i]+"%");
			System.out.println("Grades: "+grades[i]);
		}
		
	}
}