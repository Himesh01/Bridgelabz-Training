package day2.ExamResultUploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader<T> {

    private static final Pattern CSV_PATTERN =
            Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d{1,3}");

    private final Map<String, List<Integer>> subjectMarks = new HashMap<>();
    private final T examType;

    public ExamResultUploader(T examType) {
        this.examType = examType;
    }

    public void upload(String filePath)
            throws IOException, InvalidFormatException, MissingMarksException {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {

                if (!CSV_PATTERN.matcher(line).matches()) {
                    throw new InvalidFormatException("Invalid format: " + line);
                }

                String[] parts = line.split(",");

                String subject = parts[2].trim();
                int marks = Integer.parseInt(parts[3].trim());

                if (marks < 0 || marks > 100) {
                    throw new MissingMarksException("Invalid marks: " + marks);
                }

                subjectMarks
                        .computeIfAbsent(subject, k -> new ArrayList<>())
                        .add(marks);
            }
        }
    }

    public Map<String, Integer> getTopScorers() {

        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : subjectMarks.entrySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Comparator.reverseOrder());

            pq.addAll(entry.getValue());

            result.put(entry.getKey(), pq.peek());
        }
        return result;
    }

    public Map<String, List<Integer>> getSubjectMarks() {
        return subjectMarks;
    }

    public T getExamType() {
        return examType;
    }
}
