import java.util.Scanner;

public class PercentGradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maths = sc.nextInt();
		double phy = sc.nextInt();
		double chem = sc.nextInt();
		double marksObtained = maths + phy +chem;
		double total= 300.0;
		double percent = (marksObtained / total)*100.0;
		System.out.println("Average Marks : "+  percent);
		if(percent >= 80){
			System.out.println("Grade A");
			System.out.println("Level 4, above agency-normalized standards");
		}
		else if(percent >=70 && percent <=79){
			System.out.println("Grade B");
			System.out.println("Level 3, at agency-normalized standards");
		}
		else if(percent >=60 && percent <=69){
			System.out.println("Grade C");
			System.out.println("Level 2, below, but approaching agency-normalized standard");
		}else if(percent >=50 && percent <=59){
			System.out.println("Grade D");
			System.out.println("Level 1, well below agency-normalized standards");
		}else if(percent >=40 && percent <=49){
			System.out.println("Grade E");
			System.out.println("Level 1-, too below agency-normalized standards");
		}else {
			System.out.println("Grade R");
			System.out.println("Remedial standards");
		}
	}
}
		
		
		









		


		