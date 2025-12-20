/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, 
then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run

*/
import java.util.*;

public class CountRounds{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter sides of park");
	double side1 = sc.nextDouble();
	double side2 = sc.nextDouble();
	double side3 = sc.nextDouble();
	double ans = triangle(side1, side2, side3);
	System.out.println("the number of rounds user needs to do to complete 5km run "+ ans);
	
	}
	public static double triangle(double a,double b, double c){
		return 5000.0/(a+b+c);
	}
}
	