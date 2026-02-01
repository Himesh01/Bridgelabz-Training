package employeeProblem;
import java.util.*;

public class EmployeeData {

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Himesh", 25, "Male", "Sales", 2018, 30000),
                new Employee(2, "Nitin", 30, "Male", "HR", 2016, 35000),
                new Employee(3, "Raj", 28, "Male", "Product Development", 2019, 45000),
                new Employee(4, "Ranjhna", 32, "Female", "Sales", 2014, 40000),
                new Employee(5, "Kartik", 35, "Male", "Product Development", 2012, 60000),
                new Employee(6, "Anjali", 27, "Female", "Marketing", 2020, 28000),
                new Employee(7, "Vikas", 29, "Male", "Sales", 2017, 32000),
                new Employee(8, "Sneha", 24, "Female", "Product Development", 2021, 26000)
        );
    }
}
