package studentsProblem.SortingAndLimiting;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("1. Sort by Rank (Ascending):");
        System.out.println(StudentStreamsOperations.sortByRankAscending(students));

        System.out.println("\n2. Sort by Age (Descending):");
        System.out.println(StudentStreamsOperations.sortByAgeDescending(students));

        System.out.println("\n3. Top 5 Students by Rank:");
        System.out.println(StudentStreamsOperations.top5ByRank(students));

        System.out.println("\n4. Last 3 Students by Rank:");
        System.out.println(StudentStreamsOperations.last3ByRank(students));

        System.out.println("\n5. Sort by Name then Rank:");
        System.out.println(StudentStreamsOperations.sortByNameThenRank(students));
    }
}
