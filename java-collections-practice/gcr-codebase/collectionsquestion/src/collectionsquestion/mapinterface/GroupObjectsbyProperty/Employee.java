package collectionsquestion.mapinterface.GroupObjectsbyProperty;

public class Employee {

    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}