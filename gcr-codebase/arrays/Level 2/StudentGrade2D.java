import java.util.*;

public class StudentGrade2D{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		
		int maths[] = new int[n];
		int chem[] = new int[n];
		int phy[] = new int[n];
		
		for(int i=0;i<n;i++){
			System.out.print("Enter maths marks: ");
			maths[i] = sc.nextInt();
			while(maths[i]<0){
				System.out.print("Enter valid marks: ");
				maths[i] = sc.nextInt();
			}
			System.out.print("Enter chemistry marks: ");
			chem[i] = sc.nextInt();
			while(chem[i]<0){
				System.out.print("Enter valid marks: ");
				chem[i] = sc.nextInt();
			}
			System.out.print("Enter physics marks: ");
			phy[i] = sc.nextInt();
			while(phy[i]<0){
				System.out.print("Enter valid marks: ");
				phy[i] = sc.nextInt();
			}
		}
		
		double percentage[] = new double[n];
		for(int i=0;i<n;i++)
			percentage[i] = (maths[i]+chem[i]+phy[i])/3.0;
		
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
			System.out.println("Marks: "+ maths[i]+" "+chem[i]+" "+phy[i]);
			System.out.println("Percentages: "+percentage[i]+"%");
			System.out.println("Grades: "+grades[i]);
		}
		
	}
}