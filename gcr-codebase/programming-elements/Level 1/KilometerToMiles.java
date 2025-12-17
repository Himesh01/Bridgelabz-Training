
import java.util.Scanner;

public class KilometerToMiles{
	public static void main(String[]args){
		double km;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance in Km");
		km = sc.nextInt();
		double mile = km/1.6;
		System.out.println(" The total miles is " + mile +" mile for the given "+ km + " km ");
	}
}