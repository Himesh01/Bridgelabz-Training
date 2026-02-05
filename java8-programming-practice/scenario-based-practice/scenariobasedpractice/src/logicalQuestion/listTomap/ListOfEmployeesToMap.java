package logicalQuestion.listTomap;
import java.util.*;
import java.util.stream.*;

class Employee{
	private int id;
	private String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}

public class ListOfEmployeesToMap {
	public static void main(String[] args) {
		List<Employee> employees  = Arrays.asList(
				new Employee(12,"Himesh"),
				new Employee(11,"Nag"),
				new Employee(78,"Lucky"),
				new Employee(45,"Rajeev"),
				new Employee(13,"Raj")
				);
		
		Map<Integer,String> map = employees.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
		System.out.println(map);
	}
}
