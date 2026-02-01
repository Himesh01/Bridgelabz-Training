package studentsProblem.GenderBasedAnalysis;

public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private int rank;

    public Student(int id, String name, int age, String gender, int rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rank = rank;
    }

    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public String getGender() { 
    	return gender;
    }
    public int getRank() { 
    	return rank; 
    }

    @Override
    public String toString() {
        return name + " | Gender: " + gender + " | Age: " + age + " | Rank: " + rank;
    }
}
