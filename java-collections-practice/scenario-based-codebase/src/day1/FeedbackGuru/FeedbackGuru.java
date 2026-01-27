package day1.FeedbackGuru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru<T> {

    private final Map<String, List<Feedback<T>>> categorizedFeedback = new HashMap<>();

    public FeedbackGuru() {
        categorizedFeedback.put("Positive", new ArrayList<>());
        categorizedFeedback.put("Neutral", new ArrayList<>());
        categorizedFeedback.put("Negative", new ArrayList<>());
    }

    public static void main(String[] args) {

        FeedbackGuru<String> guru = new FeedbackGuru<>();

        guru.processFolder("feedback");

        guru.printSummary();
    }

    public void processFolder(String folderPath) {

        File folder = new File(folderPath);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null) {
            System.out.println("No feedback files found.");
            return;
        }

        for (File file : files) {
            processFile(file);
        }
    }

    private void processFile(File file) {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {
                try {
                    Feedback<T> feedback = parseFeedback(line);
                    categorizeFeedback(feedback);
                } catch (Exception e) {
                    System.out.println(" Skipping invalid line → " + line);
                }
            }

        } catch (IOException e) {
            System.out.println(" File error: " + file.getName());
        }
    }

    private Feedback<T> parseFeedback(String line) {

        Pattern p = Pattern.compile("(\\d{1,2})/10");
        Matcher m = p.matcher(line);

        if (!m.find()) {
            throw new IllegalArgumentException("Rating not found");
        }

        int rating = Integer.parseInt(m.group(1));

        @SuppressWarnings("unchecked")
        T type = (T) "Service";

        return new Feedback<>(type, line, rating);
    }

    private void categorizeFeedback(Feedback<T> feedback) {

        int rating = feedback.getRating();

        if (rating >= 8) {
            categorizedFeedback.get("Positive").add(feedback);
        } else if (rating >= 5) {
            categorizedFeedback.get("Neutral").add(feedback);
        } else {
            categorizedFeedback.get("Negative").add(feedback);
        }
    }

    public void printSummary() {

        System.out.println("\nFeedback Summary:\n");

        categorizedFeedback.forEach((category, list) -> {
            System.out.println(" " + category + " Feedback:");
            list.forEach(System.out::println);
            System.out.println();
        });
    }
}
