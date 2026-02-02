package functionalInterface.PredicateConditionChecking.EvenOddCheck;

import java.util.function.Predicate;

public class EvenOddChecker {
	public static void main(String[] args) {

        Predicate<Integer> isEven =
                number -> number % 2 == 0;

        int num1 = 10;
        int num2 = 7;

        System.out.println(num1 + " is Even: " + isEven.test(num1));
        System.out.println(num2 + " is Even: " + isEven.test(num2));
    }
}
