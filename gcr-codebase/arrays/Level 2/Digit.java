import java.util.Scanner;
import java.util.Arrays;

public class Digit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
		
        int[] digitsArray = new int[maxDigits];
        int index = 0;
        long tempNumber = number;

        if (tempNumber == 0) {
            digitsArray[index++] = 0;
        } else {
            while (tempNumber != 0) {
                digitsArray[index] = (int) (tempNumber % 
                tempNumber /= 10;

                index++;
                if (index >= maxDigits) {
                    System.out.println("Warning: Number has more than " + maxDigits + " digits. Only the first " + maxDigits + " were processed.");
                    break;
                }
            }
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int currentDigit = digitsArray[i];

            if (currentDigit > largest) {
                secondLargest = largest;
                largest = currentDigit;
            } else if (currentDigit > secondLargest && currentDigit != largest) {
                secondLargest = currentDigit;
            }
        }
        System.out.println("\nDigits in the array: " + Arrays.toString(Arrays.copyOf(digitsArray, index)));
        System.out.println("Largest digit: " + largest);

        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit. ");
        }

        scanner.close();
    }
}
