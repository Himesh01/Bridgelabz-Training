package studentsProblem.FlatMapCollections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("1. All Contact Numbers:");
        StudentStreamOperations.printAllContacts(students);

        System.out.println("\n2. Total Contact Count:");
        System.out.println(StudentStreamOperations.countTotalContacts(students));

        System.out.println("\n3. Students With Multiple Contacts:");
        System.out.println(StudentStreamOperations
                .studentsWithMultipleContacts(students));

        System.out.println("\n4. Unique Contact Numbers:");
        System.out.println(StudentStreamOperations.uniqueContacts(students));
    }
}
