package studentsProblem.FlatMapCollections;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStreamOperations {

    // 1️ Print all contact numbers
    public static void printAllContacts(List<Student> list) {
        list.stream()
                .flatMap(student -> student.getContacts().stream())
                .forEach(System.out::println);
    }

    // 2️ Count total contact numbers
    public static long countTotalContacts(List<Student> list) {
        return list.stream()
                .flatMap(student -> student.getContacts().stream())
                .count();
    }

    // 3️ Students with more than one contact number
    public static List<Student> studentsWithMultipleContacts(List<Student> list) {
        return list.stream()
                .filter(student -> student.getContacts().size() > 1)
                .collect(Collectors.toList());
    }

    // 4️ Unique contact numbers
    public static Set<String> uniqueContacts(List<Student> list) {
        return list.stream()
                .flatMap(student -> student.getContacts().stream())
                .collect(Collectors.toSet());
    }
}