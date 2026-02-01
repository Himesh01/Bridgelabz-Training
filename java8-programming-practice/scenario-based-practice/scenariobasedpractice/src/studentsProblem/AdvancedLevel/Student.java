package studentsProblem.AdvancedLevel;

public class Student {

    private int id;
    private String name;
    private String department;
    private int rank;

    public Student(int id, String name, String department, int rank) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.rank = rank;
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
    public int getRank() { 
    	return rank; 
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department + " | Rank: " + rank;
    }
}
