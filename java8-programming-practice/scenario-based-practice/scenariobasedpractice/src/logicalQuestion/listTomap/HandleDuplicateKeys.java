package logicalQuestion.listTomap;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeData {
    private String name;
    private String department;
    private double salary;

    public EmployeeData(int id, String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { 
    	return department; 
    }
    public double getSalary() { 
    	return salary; 
    }

    @Override
    public String toString() {
        return name + " " + department + " " + salary;
    }
}

public class HandleDuplicateKeys {

    public static void main(String[] args) {

        List<EmployeeData> employees = Arrays.asList(
                new EmployeeData(1, "Himesh", "IT", 50000),
                new EmployeeData(2, "Neha", "HR", 40000),
                new EmployeeData(3, "Ravi", "IT", 60000),
                new EmployeeData(4, "Nag", "HR", 45000)
        );

        Map<String, Double> salaryByDept =
                employees.stream()
                        .collect(Collectors.toMap(
                        		EmployeeData::getDepartment,
                        		EmployeeData::getSalary,
                                Double::sum
                        ));

        System.out.println(salaryByDept);
    }
}
