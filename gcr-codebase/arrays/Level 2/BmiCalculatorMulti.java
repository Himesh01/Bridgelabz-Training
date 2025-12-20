import java.util.*;

class BmiCalculatorMulti{
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
		
		double[][] personData = new double[n][3];
		String[] weightStatus = new String[n];

		for(int i=0;i<n;i++){
			double bmi = bMI[i][0]/(bMI[i][1]*bMI[i][1]);
			personData[i][0] =bMI[i][0];
			personData[i][1] = bMI[i][1];
			personData[i][2] = bmi;
			if(bmi>=40){
				weightStatus[i]= "Obese";
				System.out.println("height: "+bMI[i][1]+"Weight: "+bMI[i][0]+"BMI: "+bmi+" Weight status: Obese");
				}
			else if(bmi>=25){
				weightStatus[i]= "Overweight";
				System.out.println("height: "+bMI[i][1]+"Weight: "+bMI[i][0]+"BMI: "+bmi+" Weight status: Overweight");
				}
			else if(bmi>18.5){
				weightStatus[i]= "Normal";
				System.out.println("height: "+bMI[i][1]+"Weight: "+bMI[i][0]+"BMI: "+bmi+" Weight status: Normal");
				}
			else{
				weightStatus[i]= "Underweight";
				System.out.println("height: "+bMI[i][1]+"Weight: "+bMI[i][0]+"BMI: "+bmi+" Weight status: Underweight");
				}			
		}
		for(int i=0;i<personData.length;i++)
				System.out.println(Arrays.toString(personData[i])+" "+ weightStatus[i]);
	}
}