package functionalInterface.FunctionDataTransformation.EmployeeNameUpperCase;

import java.util.function.Function;

public class NameToUpperCase {
	public static void main(String[] args) {

        Function<Employee, String> toUpperCase =
                emp -> emp.name.toUpperCase();

        Employee e1 = new Employee("himesh");

        System.out.println("Uppercase Name: " + toUpperCase.apply(e1));
    }
}
