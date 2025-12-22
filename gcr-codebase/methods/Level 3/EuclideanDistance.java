import java.util.*;

public class EuclideanDistance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first point: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.print("Enter second point: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		System.out.println("Distance between these point is: "+calculateDistance(x1, x2, y1, y2));
		
		double slope[] = slopeEquation(x1, x2, y1, y2);
		System.out.println("Slope os line is: "+slope[0]+", and Intercept is: "+slope[1]);
		
	}
	
	//Method to find the Euclidean distance between two points
	public static double calculateDistance(double x1, double x2, double y1, double y2){
		double cal  = (Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		return Math.sqrt(cal);
	}
	
	//Write a Method to find the equation of a line given two points
	public static double[] slopeEquation(double x1, double x2, double y1, double y2){
		
		if(x1==x2)
			return new double[] {Double.POSITIVE_INFINITY, 0};
		double m = (y2-y1)/(x2-x1);
		
		double b = y1 -m*x1;
		
		double slope[] = {m,b};
		return slope;
	}
}