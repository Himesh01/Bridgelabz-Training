package studentsProblem.BonusChallenge;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("1. Top 3 Youngest Students:");
        System.out.println(StudentService.top3Youngest(students));

        System.out.println("\n2. Top 3 Oldest Students:");
        System.out.println(StudentService.top3Oldest(students));

        System.out.println("\n3. Partition Age > 25:");
        System.out.println(StudentService.partitionByAge(students));

        System.out.println("\n4. Partition Rank < 100:");
        System.out.println(StudentService.partitionByRank(students));

        System.out.println("\n5. City with Maximum Students:");
        System.out.println(StudentService.cityWithMaxStudents(students).orElse(null));

        System.out.println("\n6. Department with Minimum Students:");
        System.out.println(StudentService.departmentWithMinStudents(students).orElse(null));
    }
}
