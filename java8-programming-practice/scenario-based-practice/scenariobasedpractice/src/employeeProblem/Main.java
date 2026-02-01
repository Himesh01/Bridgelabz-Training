package employeeProblem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        System.out.println("1. Male & Female Count:");
        System.out.println(EmployeeStreamOperations.countByGender(employees));

        System.out.println("\n2. Departments:");
        EmployeeStreamOperations.printDepartments(employees);

        System.out.println("\n3. Average Age by Gender:");
        System.out.println(EmployeeStreamOperations.averageAgeByGender(employees));

        System.out.println("\n4 & 15. Highest Paid Employee:");
        System.out.println(EmployeeStreamOperations.highestPaid(employees).orElse(null));

        System.out.println("\n5. Joined After 2015:");
        System.out.println(EmployeeStreamOperations.joinedAfter2015(employees));

        System.out.println("\n6. Count By Department:");
        System.out.println(EmployeeStreamOperations.countByDepartment(employees));

        System.out.println("\n7. Average Salary By Department:");
        System.out.println(EmployeeStreamOperations.avgSalaryByDept(employees));

        System.out.println("\n8. Youngest Male in Product Development:");
        System.out.println(EmployeeStreamOperations
                .youngestMaleInProductDev(employees).orElse(null));

        System.out.println("\n9. Most Experienced Employee:");
        System.out.println(EmployeeStreamOperations
                .mostExperienced(employees).orElse(null));

        System.out.println("\n10. Male & Female in Sales:");
        System.out.println(EmployeeStreamOperations.salesGenderCount(employees));

        System.out.println("\n11. Average Salary by Gender:");
        System.out.println(EmployeeStreamOperations.avgSalaryByGender(employees));

        System.out.println("\n12. Names By Department:");
        System.out.println(EmployeeStreamOperations.namesByDept(employees));

        System.out.println("\n13. Salary Statistics:");
        DoubleSummaryStatistics stats =
                EmployeeStreamOperations.salaryStats(employees);
        System.out.println("Total Salary: " + stats.getSum());
        System.out.println("Average Salary: " + stats.getAverage());

        System.out.println("\n14. Salary > 25k:");
        System.out.println(EmployeeStreamOperations.salaryMoreThan25k(employees));

        System.out.println("\n16. Second Highest Paid:");
        System.out.println(EmployeeStreamOperations
                .secondHighest(employees).orElse(null));

        System.out.println("\n17. Third Highest Paid:");
        System.out.println(EmployeeStreamOperations
                .thirdHighest(employees).orElse(null));

        System.out.println("\n18. Lowest Paid:");
        System.out.println(EmployeeStreamOperations
                .lowestPaid(employees).orElse(null));

        System.out.println("\n19. Second Lowest Paid:");
        System.out.println(EmployeeStreamOperations
                .secondLowest(employees).orElse(null));

        System.out.println("\n20. First Five Lowest Paid:");
        System.out.println(EmployeeStreamOperations.firstFiveLowest(employees));

        System.out.println("\n21. First Five Highest Paid:");
        System.out.println(EmployeeStreamOperations.firstFiveHighest(employees));
    }
}
