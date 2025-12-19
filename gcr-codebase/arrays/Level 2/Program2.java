import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();

        long tempNumber = Math.abs(number);
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (tempNumber > 0) {
            if (index == maxDigit) {
                int newMaxDigit = maxDigit + 10;
                int[] tempArray = new int[newMaxDigit];
                for (int i = 0; i < maxDigit; i++) {
                    tempArray[i] = digits[i];
                }
                digits = tempArray;
                maxDigit = newMaxDigit;
            }
            digits[index] = (int)(tempNumber % 10);
            tempNumber /= 10;
            index++;
        }
        int actualDigitCount = (number == 0) ? 1 : index;
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < actualDigitCount; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Digits : ");
        for (int i = 0; i < actualDigitCount; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        System.out.println("largest digit is: " + largest);
        System.out.println("Second largest digit is: " + secondLargest);
    }
}
