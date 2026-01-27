package iostreampractice.csv.IntermediateProblem;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "		| " + department + "	 | " + salary;
    }
}