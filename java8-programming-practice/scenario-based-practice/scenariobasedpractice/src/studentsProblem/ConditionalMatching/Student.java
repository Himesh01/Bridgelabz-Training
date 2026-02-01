package studentsProblem.ConditionalMatching;

public class Student {

    private int id;
    private String name;
    private int age;
    private String branch;

    public Student(int id, String name, int age, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }
}
