package com.Sorting.ExamCell;

public class Main {

    public static void main(String[] args) {

        Student[] students = {
            new Student(1, "Raj", 78),
            new Student(2, "Nitin", 92),
            new Student(3, "Rajeev", 85),
            new Student(4, "Jay", 90),
            new Student(5, "Nilesh", 88)
        };

        System.out.println("Before Ranking:");
        for (Student s : students) {
            s.display();
        }

        ExamCell.mergeSort(students, 0, students.length - 1);

        System.out.println("\nState-Level Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + ": " + s.name + " (" + s.score + ")");
        }
    }
}
