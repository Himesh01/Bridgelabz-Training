package functionalInterface.FunctionDataTransformation.payrollsystem;

import java.util.function.Function;

public class AnnualSalaryCalculator {
	public static void main(String[] args) {

        Function<Employee, Double> annualSalary =
                emp -> emp.monthlySalary * 12;

        Employee e1 = new Employee("Himesh", 30000);

        System.out.println(e1.name + " Annual Salary: " + annualSalary.apply(e1));
    }
}
