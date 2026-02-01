package studentsProblem.BasicFilteringMapping;
import java.util.*;

public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("1. Rank < 50:");
        System.out.println(StudentStreamOperations.rankLessThan50(students));

        System.out.println("\n2. Age > 25:");
        System.out.println(StudentStreamOperations.ageGreaterThan25(students));

        System.out.println("\n3. Student Names:");
        System.out.println(StudentStreamOperations.getStudentNames(students));

        System.out.println("\n4. Mechanical Engineering Students:");
        System.out.println(StudentStreamOperations.mechanicalStudents(students));

        System.out.println("\n5. Students Not From Mumbai:");
        System.out.println(StudentStreamOperations.notFromMumbai(students));
    }
}
