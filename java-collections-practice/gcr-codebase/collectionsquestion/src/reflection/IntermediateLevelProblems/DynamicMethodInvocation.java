package reflection.IntermediateLevelProblems;


import java.lang.reflect.Method;
import java.util.Scanner;
public class DynamicMethodInvocation {
    static class MathOperations {

        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = sc.next();

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            MathOperations obj = new MathOperations();

            Method method = MathOperations.class
                    .getMethod(methodName, int.class, int.class);
            int result = (int) method.invoke(obj, a, b);

            System.out.println("Result = " + result);

        } catch (NoSuchMethodException e) {
            System.out.println(" Invalid method name!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}