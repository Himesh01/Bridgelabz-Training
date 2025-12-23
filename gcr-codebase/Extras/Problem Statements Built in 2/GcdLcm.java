import java.util.*;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number 1: ");
        int n = sc.nextInt();
		
		System.out.println("Enter a number : 2");
        int s = sc.nextInt();

        System.out.println("The GCD is " + gcd(n, s));
        System.out.println("The LCM is " + lcm(n, s));

    }
    public static int gcd(int n, int s) {
        while (s != 0) {
            int temp = s;
            s = n % s;
            n = temp;
        }
        return n;
    }
    public static int lcm(int n, int s) {
        return (n * s) / gcd(n, s);
    }
}