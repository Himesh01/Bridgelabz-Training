
import java.util.Scanner;

public class DistanceInYard{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		float feet = sc.nextInt();
		float yard = feet/3;
		float miles = yard/1760;
		System.out.println(" The distance in yards is "+yard+" while the distance in miles is "+miles);
	}
}
