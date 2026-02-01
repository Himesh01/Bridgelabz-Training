package studentsProblem.AdvancedLevel;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("1. Map<Id, Name>:");
        System.out.println(StudentService.convertToIdNameMap(students));

        System.out.println("\n2. Map<Department, List<Student>>:");
        System.out.println(StudentService.groupByDepartment(students));

        System.out.println("\n3. Names starting with 'S':");
        System.out.println(StudentService.namesStartingWithS(students));

        System.out.println("\n4. Name length > 5:");
        System.out.println(StudentService.nameLengthGreaterThan5(students));

        System.out.println("\n5. Even Rank Students:");
        System.out.println(StudentService.evenRankStudents(students));

        System.out.println("\n6. Odd Rank Students:");
        System.out.println(StudentService.oddRankStudents(students));
    }
}
