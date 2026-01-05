package scenariobasedpractice.collegeinformation;

public class CampusConnectDemo {

    public static void main(String[] args) {

        Faculty faculty = new Faculty(1, "Prof. Himesh Kurmi", "himesh@uni.edu", "Computer Science");

        Student s1 = new Student(101, "Lucky pal", "lucky@uni.edu");
        Student s2 = new Student(102, "Nageshwar Patel", "nag@uni.edu");

        Course javaCourse = new Course("CS101", "Java Programming", faculty);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        s1.addGrade(8.8);
        s1.addGrade(9.2);

        s2.addGrade(7.5);
        s2.addGrade(8.0);

        // Polymorphism
        Person p1 = s1;
        Person p3 = s2;
        Person p2 = faculty;

        p1.printDetails();
        System.out.println();
        p2.printDetails();
        System.out.println();
        p3.printDetails();
        System.out.println();

        javaCourse.printCourseDetails();
    }
}
