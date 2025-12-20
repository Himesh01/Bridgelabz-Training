import java.util.*;
public class Trigonometry{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle ");
		double degree = sc.nextDouble();
		
		double [] ans = calculateTrigonometricFunctions(degree);
		
		System.out.println("The value of sin is "+ans[0]+" the value of cos is "+ans[1]+" the value of tan is "+ans[2]);
	}
	public static double[] calculateTrigonometricFunctions(double angle){
		angle = Math.toRadians(angle);
		
		double[] ans = new double[3];
		
		ans[0] = Math.sin(angle);
		ans[1] = Math.cos(angle);
		ans[2] = Math.tan(angle);
		
		return ans;
	}

}