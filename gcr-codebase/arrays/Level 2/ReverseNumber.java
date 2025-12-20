import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int inputNumber = scanner.nextInt();
        int tempNumber = Math.abs(inputNumber);
        scanner.close();
        System.out.println("welcome to Reverse Number");
        if (inputNumber == 0) {
            System.out.println("reversed order: [0]");
            return;
        }
        int count = 0;
        int tempCountNumber = tempNumber;
        while (tempCountNumber > 0) {
            tempCountNumber /= 10;
            count++;
        }
        int[] digitsArray = new int[count];
        int index = 0;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            digitsArray[index] = digit;
            tempNumber /= 10;
            index++;
        }
		
        System.out.print("reverse order: [");
        for (int i = 0; i < digitsArray.length; i++) {
            System.out.print(digitsArray[i]);
            if (i < digitsArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
