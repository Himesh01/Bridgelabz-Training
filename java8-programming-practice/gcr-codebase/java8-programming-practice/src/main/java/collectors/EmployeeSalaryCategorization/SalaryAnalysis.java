package collectors.EmployeeSalaryCategorization;

import java.util.*;
import java.util.stream.Collectors;

public class SalaryAnalysis {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Himesh", "Engineering", 95000),
            new Employee("Raj", "Sales", 60000),
            new Employee("Chandan", "Engineering", 105000),
            new Employee("Sarnam", "Sales", 70000),
            new Employee("Rajeev", "HR", 65000)
        );
        
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        System.out.println("Average Salary by Department:");
        avgSalaryByDept.forEach((dept, avg) -> 
            System.out.printf("%s: $%.2f%n", dept, avg));
    }
}
