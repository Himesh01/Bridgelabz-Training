import java.util.*;

public class BodyMassIndex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int persons = 2;
		double[][] arr = new double[persons][2];
		for(int i =0 ; i <persons; i++){
			System.out.println("Enter details of persons "+ (i +1));
			System.out.println("Enter weight(kg); ");
			arr[i][0] = sc.nextDouble();
			
			System.out.println("Enetr height(cm): ");
			arr[i][1] = sc.nextDouble();
		}
		String[][] bMiResult = calculateBMI(arr);
		displayResults(bMiResult);
		
	}
	//Method to find the BMI and status of every person
	public static String[][] calculateBMI(double[][] arr){
		String[][] results = new String[arr.length][4];
		
		for (int i = 0; i < arr.length; i++) {
            double weight = arr[i][0];
            double height = arr[i][1] / 100.0;
			
			double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0;
			
			String status = "";
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }
			
			results[i][0] = String.valueOf(arr[i][1]);
            results[i][1] = String.valueOf(arr[i][0]);
            results[i][2] = String.valueOf(bmi);
            results[i][3] = status;
        }

        return results;
    }
	
	//method to display results
	public static void displayResults(String[][] results){
		System.out.println("person no. | Height | Weight | BMI | Status ");
		for(int i=0; i<results.length; i++){
			System.out.printf("%10d | %12s | %12s | %5s | %s\n" ,i+1, results[i][0], results[i][1] , results[i][2], results[i][3]);
		}
	}
}
		
		
		
		