package studentsProblem.BonusChallenge;

public class Student {

    private int id;
    private String name;
    private int age;
    private String city;
    private String department;
    private int rank;

    public Student(int id, String name, int age,
                   String city, String department, int rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.department = department;
        this.rank = rank;
    }

    public String getName() {
    	return name; 
    }
    public int getAge() { 
    	return age; 
    }
    public String getCity() { 
    	return city; 
    }
    public String getDepartment() { 
    	return department; 
    }
    public int getRank() { 
    	return rank;
    }

    @Override
    public String toString() {
        return name + " | Age: " + age +
               " | City: " + city +
               " | Dept: " + department +
               " | Rank: " + rank;
    }
}
