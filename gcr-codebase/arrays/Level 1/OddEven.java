import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Error:");
        } else {
            int[] odd = new int[n / 2 + 1];
            int[] even = new int[n / 2 + 1];
            int indexOdd = 0;
            int indexEven = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    even[indexEven++] = i;
                } else {
                    odd[indexOdd++] = i;
                }
            }

            System.out.print("Odd numbers: ");
            for (int i = 0; i < indexOdd; i++) {
                System.out.print(odd[i] + " ");
            }
            System.out.println();

            System.out.print("Even numbers: ");
            for (int i = 0; i < indexEven; i++) {
                System.out.print(even[i] + " ");
            }
            System.out.println();
        }
    }
}

		
	
		