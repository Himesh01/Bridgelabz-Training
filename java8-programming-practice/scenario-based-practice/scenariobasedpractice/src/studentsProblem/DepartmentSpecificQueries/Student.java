package studentsProblem.DepartmentSpecificQueries;

public class Student {

    private int id;
    private String name;
    private int age;
    private String department;
    private String state;
    private int rank;

    public Student(int id, String name, int age,
                   String department, String state, int rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.state = state;
        this.rank = rank;
    }

    public String getName() {
    	return name; 
    }
    public int getAge() { 
    	return age; 
    }
    public String getDepartment() {
    	return department; 
    }
    public String getState() { 
    	return state; 
    }
    public int getRank() {
    	return rank; 
    }

    @Override
    public String toString() {
        return name + " | Dept: " + department +
               " | Age: " + age + " | Rank: " + rank +
               " | State: " + state;
    }
}
