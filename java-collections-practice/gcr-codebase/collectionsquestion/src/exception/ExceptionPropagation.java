package exception;

public class ExceptionPropagation {

    static void method1() {
        int x = 10 / 0;
        System.out.println(x);
    }

    static void method2() {
        method1();   
    }

    public static void main(String[] args) {

        try {
            method2();   
        } 
        catch (ArithmeticException e) {
        	System.out.println("Exception handled : "+e.getClass().getName());
            System.out.println("Handled exception in main");
        }
    }
}