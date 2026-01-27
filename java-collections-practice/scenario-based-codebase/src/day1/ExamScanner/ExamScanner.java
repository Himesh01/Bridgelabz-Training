package day1.ExamScanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

    private static final List<String> ANSWER_KEY =
            Arrays.asList("A", "B", "C", "D", "A", "B", "C");

    public static void main(String[] args) {

        Map<String, Integer> resultMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("answers.csv"))) {

            String line;

            while ((line = br.readLine()) != null) {
                try {
                    processLine(line, resultMap);
                } catch (Exception e) {
                    System.out.println(" Skipping invalid line → " + line);
                }
            }

        } catch (IOException e) {
            System.out.println(" File read error");
        }

        printSortedResults(resultMap);
    }

    private static void processLine(String line, Map<String, Integer> map) {

        validateFormat(line);

        String[] tokens = line.split(",");

        String name = tokens[0];

        List<String> answers = Arrays.asList(Arrays.copyOfRange(tokens, 1, tokens.length));

        AnswerSheet<String> sheet = new MathAnswerSheet(answers);

        int score = sheet.calculateScore(ANSWER_KEY);

        map.put(name, score);
    }

    private static void validateFormat(String line) {

        String regex = "^[A-Za-z ]+(,[A-D])+$";

        if (!Pattern.matches(regex, line)) {
            throw new IllegalArgumentException("Invalid CSV format");
        }
    }

    private static void printSortedResults(Map<String, Integer> resultMap) {

        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(resultMap.entrySet());

        System.out.println("\n Exam Results (Top Performers First)\n");

        while (!pq.isEmpty()) {
            var entry = pq.poll();
            System.out.println(entry.getKey() + " → Score: " + entry.getValue());
        }
    }
}