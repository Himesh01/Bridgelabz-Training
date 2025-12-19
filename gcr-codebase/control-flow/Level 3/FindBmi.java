import java.util.Scanner;

public class FindBmi{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		double heightInMeter = height/100;
		double bMi = weight/(heightInMeter * heightInMeter);
		
		System.out.println("BMI is: " + bMi);
        String status;

        if (bMi <= 18.4) {
            status = "Underweight";
        } else if (bMi >= 18.5 && bMi <= 24.9) {
            status = "Normal";
        } else if (bMi >= 25.0 && bMi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.println("Weight Status: " + status);
    }
}
		
		
		