package com.Sorting.ExamCell;

public class Student {
    int id;
    String name;
    int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void display() {
        System.out.println(name + " | Score: " + score);
    }
}
