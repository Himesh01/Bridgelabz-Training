package studentsProblem.GroupingAndAggregation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("1. Count by Department:");
        System.out.println(StudentStreamOperations.countByDepartment(students));

        System.out.println("\n2. Count by City:");
        System.out.println(StudentStreamOperations.countByCity(students));

        System.out.println("\n3. Average Age by Department:");
        System.out.println(StudentStreamOperations.averageAgeByDepartment(students));

        System.out.println("\n4. Average Rank by Gender:");
        System.out.println(StudentStreamOperations.averageRankByGender(students));

        System.out.println("\n5. Total Students:");
        System.out.println(StudentStreamOperations.totalStudents(students));

        System.out.println("\n6. Department with Highest Average Rank:");
        System.out.println(
                StudentStreamOperations
                        .departmentWithHighestAvgRank(students)
                        .orElse(null)
        );
    }
}
