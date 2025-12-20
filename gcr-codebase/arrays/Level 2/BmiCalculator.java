import java.util.Scanner;

public class BmiCalculator {

    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of people: ");
		int n = sc.nextInt();
		
		double bMI[][] = new double[n][2];
		for(int i =0;i<n;i++){
			System.out.println("Enter weight: ");
			bMI[i][0] = sc.nextDouble();
			System.out.println("Enter height(in meters): ");
			bMI[i][1]=sc.nextDouble();
		}
		
		for(int i=0;i<n;i++){
		double bmi = bMI[i][0]/(bMI[i][1]*bMI[i][1]);
		if(bmi>=40)
			System.out.println("height: "+bMI[i][1]+"Weight: "+bMI[i][0]+"BMI: "+bmi+" Weight status: Obese");
		else if(bmi>=25)
			System.out.println("height: "+bMI[i][1]+"Weight: "+bMI[i][0]+"BMI: "+bmi+" Weight status: Overweight");
		else if(bmi>18.5)
			System.out.println("height: "+bMI[i][1]+"Weight: "+bMI[i][0]+"BMI: "+bmi+" Weight status: Normal");
		else
			System.out.println("height: "+bMI[i][1]+"Weight: "+bMI[i][0]+"BMI: "+bmi+" Weight status: Underweight");
		}
	}
}