package logicalQuestion.listTomap;

import java.util.*;
import java.util.stream.Collectors;

class Employees {

    private int id;
    private String name;
    private String department;

    public Employees(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
    	return id;
    }
    public String getName() {
    	return name;
    }
    public String getDepartment() { 
    	return department; 
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department;
    }
}

public class ListofobjectstoMap {

    public static void main(String[] args) {

        List<Employees> employees = Arrays.asList(
                new Employees(1, "Himesh", "IT"),
                new Employees(2, "Nag", "HR"),
                new Employees(3, "Ravi", "IT")
        );

        Map<Integer, String> map =employees.stream().collect(Collectors.toMap(
                                Employees::getId,
                                Employees::getName
                        ));

        System.out.println(map);
    }
}
