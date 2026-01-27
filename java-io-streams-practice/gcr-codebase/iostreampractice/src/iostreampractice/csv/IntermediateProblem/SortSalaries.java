package iostreampractice.csv.IntermediateProblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class SortSalaries {
	public static void main(String[] args) {
        String csvFile = "updatedUserData.csv"; 
        String line;
        String csvSplitBy = ",";

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                employees.add(new Employee(name, department, salary));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

        System.out.println("Top 5 highest-paid employees:");
        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            System.out.println(employees.get(i));
        }
    }
}