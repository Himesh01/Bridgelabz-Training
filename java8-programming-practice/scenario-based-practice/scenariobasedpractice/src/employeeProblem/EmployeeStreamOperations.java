package employeeProblem;
import java.util.stream.*;
import java.util.*;

public class EmployeeStreamOperations {
	
	//How many male and female employees are there in the organization ?
	public static Map<String , Long> countByGender(List<Employee>list){
		return list.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	}
	
	// Print the name of all departments in the organization ?
	public static void printDepartments(List<Employee> list) {
        list.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
	}
	
	// What is the average age of male and female employees ?
    public static Map<String, Double> averageAgeByGender(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)));
    }
    
    // Get the details of highest paid employee in the organization ?
    //Who is the highest paid employee in the organization?
    public static Optional<Employee> highestPaid(List<Employee> list) {
        return list.stream()
                .max(Comparator.comparing(Employee::getSalary));
    }

    // Get the names of all employees who have joined after 2015 ?
    public static List<String> joinedAfter2015(List<Employee> list) {
        return list.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    // Count the number of employees in each department ?
    public static Map<String, Long> countByDepartment(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));
    }

    // What is the average salary of each department ?
    public static Map<String, Double> avgSalaryByDept(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
    }

    // Get the details of youngest male employee in the product development department ?
    public static Optional<Employee> youngestMaleInProductDev(List<Employee> list) {
        return list.stream()
                .filter(e -> e.getGender().equals("Male"))
                .filter(e -> e.getDepartment().equals("Product Development"))
                .min(Comparator.comparing(Employee::getAge));
    }

    // Who has the most working experience in the organization?
    public static Optional<Employee> mostExperienced(List<Employee> list) {
        return list.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining));
    }

    // How many male and female employees are there in the Sales team?
    public static Map<String, Long> salesGenderCount(List<Employee> list) {
        return list.stream()
                .filter(e -> e.getDepartment().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.counting()));
    }

    // What is the average salary of male and female employees ?
    public static Map<String, Double> avgSalaryByGender(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)));
    }

    // List down the names of all employees in each department ?
    public static Map<String, List<String>> namesByDept(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
    }

    // What is the average salary and total salary of the whole organization?
    public static DoubleSummaryStatistics salaryStats(List<Employee> list) {
        return list.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
    }

    // Get the employee whose salary are more than 25k.
    public static List<Employee> salaryMoreThan25k(List<Employee> list) {
        return list.stream()
                .filter(e -> e.getSalary() > 25000)
                .collect(Collectors.toList());
    }

    // Who is the second highest paid employee in the organization?
    public static Optional<Employee> secondHighest(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
    }

    // Who is the third highest paid employee in the organization?
    public static Optional<Employee> thirdHighest(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .findFirst();
    }

    // Who is the lowest paid employee in the organization?
    public static Optional<Employee> lowestPaid(List<Employee> list) {
        return list.stream()
                .min(Comparator.comparing(Employee::getSalary));
    }

    // Who is the second lowest paid employee in the organization?
    public static Optional<Employee> secondLowest(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .skip(1)
                .findFirst();
    }

    // Get the first five lowest paid employee in the organization?
    public static List<Employee> firstFiveLowest(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .limit(5)
                .collect(Collectors.toList());
    }

    // Get the first five highest paid employee in the organization?
    public static List<Employee> firstFiveHighest(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }
}
