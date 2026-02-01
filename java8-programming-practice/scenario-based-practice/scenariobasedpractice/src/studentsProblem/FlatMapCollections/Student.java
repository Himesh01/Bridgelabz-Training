package studentsProblem.FlatMapCollections;

import java.util.List;

public class Student {

    private int id;
    private String firstName;
    private int age;
    private String gender;
    private String city;
    private int rank;
    private String branch;
    private List<String> contacts;

    public Student(int id, String firstName, int age, String gender, String city, int rank, String branch, List<String> contacts) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.rank = rank;
        this.branch = branch;
        this.contacts = contacts;
    }

    public List<String> getContacts() {
    	return contacts;
    }
    public String getFirstName() {
    	return firstName;
    }

    @Override
    public String toString() {
        return firstName + " Contacts: " + contacts;
    }
}
