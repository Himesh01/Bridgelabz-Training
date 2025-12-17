import java.util.Scanner;
public class IntOperation{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int solve1 = a + b *c;
		int solve2 = a * b + c;
		int solve3 = c + a / b;
		int solve4 = a % b + c;
		System.out.println("Output of these operations are "+ solve1+","+solve2+","+solve3+ ","+ solve4);
	}
}