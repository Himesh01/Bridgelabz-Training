import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double solve1 = a + b *c;
		double solve2 = a * b + c;
		double solve3 = c + a / b;
		double solve4 = a % b + c;
		System.out.println("Output of these operations are "+ solve1+","+solve2+","+solve3+ ","+ solve4);
	}
}