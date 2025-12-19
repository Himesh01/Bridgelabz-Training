import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;
        while (originalNumber != 0){
            int last = originalNumber % 10;
            sum = sum + (last * last * last);
            originalNumber = originalNumber /10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }
    }
}
