package collectionsquestion.mapinterface.GroupObjectsbyProperty;

import java.util.*;

public class GroupByDepartment {

    public static Map<String, List<Employee>> groupEmployees(List<Employee> employees) {

        Map<String, List<Employee>> deptMap = new HashMap<>();

        for (Employee emp : employees) {

            String dept = emp.getDepartment();

            deptMap.putIfAbsent(dept, new ArrayList<>());
          
            deptMap.get(dept).add(emp);
        }

        return deptMap;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Himesh", "HR"));
        employees.add(new Employee("Nag", "IT"));
        employees.add(new Employee("Lucky", "HR"));

        Map<String, List<Employee>> result = groupEmployees(employees);

        for (Map.Entry<String, List<Employee>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}