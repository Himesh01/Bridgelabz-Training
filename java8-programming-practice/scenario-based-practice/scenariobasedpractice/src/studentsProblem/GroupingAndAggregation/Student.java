package studentsProblem.GroupingAndAggregation;

public class Student {

    private int id;
    private String firstName;
    private int age;
    private String gender;
    private String city;
    private int rank;
    private String branch;
    private String contacts;

    public Student(int id, String firstName, int age, String gender, String city, int rank, String branch, String contacts) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.rank = rank;
        this.branch = branch;
        this.contacts = contacts;
    }

    public int getId() {
    	return id;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public int getAge() {
    	return age;
    }
    
    public String getGender() {
    	return gender;
    }
    
    public String getCity() {
    	return city;
    }
    
    public int getRank(){
    	return rank;
    }
    
    public String getBranch() {
    	return branch;
    }
    
    public String getContacts() {
    	return contacts;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + branch + " Rank:" + rank;
    }
}
