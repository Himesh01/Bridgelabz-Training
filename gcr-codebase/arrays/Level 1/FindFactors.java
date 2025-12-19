import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		int maxFactor =10;
		int arr[] = new int[maxFactor];
		int index = 0;
		
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] tempArray = new int[maxFactor];
                    for (int j = 0; j < arr.length; j++) {
                        tempArray[j] = arr[j];
                    }
                    arr = tempArray;
                }
                arr[index] = i;
                index++;
            }
        }
		
        System.out.println("\nFactors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
