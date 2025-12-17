
import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		
		float base;
		float height;
		base = sc.nextFloat();
		height = sc.nextFloat();
		double area = 0.5* base * height;
		double inch = area / 2.54;
		System.out.println(" The Area of the triangle inch sq in is "+ inch +" and sq cm is " + area);
	}
}

