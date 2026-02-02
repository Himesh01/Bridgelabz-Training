package functionalInterface.PredicateConditionChecking.employeeSystem;

import java.util.function.Predicate;

public class EmployeeMain {
	public static void main(String[] args) {

        Predicate<Employee> highSalary =
                emp -> emp.salary > 30000;

        Employee e1 = new Employee("Himesh", 45000);
        Employee e2 = new Employee("Rajeev", 25000);

        System.out.println(e1.name + " High Salary: " + highSalary.test(e1));
        System.out.println(e2.name + " High Salary: " + highSalary.test(e2));
    }
}
