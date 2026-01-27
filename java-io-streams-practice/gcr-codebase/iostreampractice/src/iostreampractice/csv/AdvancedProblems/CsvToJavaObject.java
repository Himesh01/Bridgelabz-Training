package iostreampractice.csv.AdvancedProblems;

import iostreampractice.csv.IntermediateProblem.Employee;

import java.io.*;
import java.util.*;

public class CsvToJavaObject {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		try(BufferedReader br= new BufferedReader(new FileReader("employee.csv"))) {
			String line;
			boolean isHeader=true;
			while((line=br.readLine())!=null) {
				if(isHeader) {
					isHeader=false;
					continue;
				}
				String emp[] = line.split(",");
				String name = emp[0].trim();
				String dept = emp[1].trim();
				double salary = Double.parseDouble(emp[2].trim());
				
				list.add(new Employee(name,dept,salary));
			}
			
			for(Employee e:list) {
				System.out.println(e);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}