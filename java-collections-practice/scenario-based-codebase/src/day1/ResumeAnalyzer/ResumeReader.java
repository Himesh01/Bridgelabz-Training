package day1.ResumeAnalyzer;

import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.nio.file.Files;

public class ResumeReader {
	public static final Pattern EMAIL_PATTERN = 
			Pattern.compile("[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}");
	public static final Pattern PHONE_PATTERN = 
			Pattern.compile("\\b\\d{10}\\b");
	private static final List<String> KEYWORDS =
            Arrays.asList("Java", "Python", "Spring");
	
	public static void main(String[] args) {
        File folder = new File("resumes");
        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> sortedCandidates = new ArrayList<>();

        for (File file : folder.listFiles()) {
            try {
                if (!file.getName().endsWith(".txt") && !file.getName().endsWith(".pdf")) {
                    throw new InvalidResumeFormatException("Unsupported file: " + file.getName());
                }

                String content = readFile(file);
                ResumeData data = extractResumeData(content);
                resumeMap.put(data.getEmail(), data);
                sortedCandidates.add(data);

            } catch (Exception e) {
                System.out.println("Skipping file: " + e.getMessage());
            }
        }

        // Sort by keyword match count (descending)
        sortedCandidates.sort((a, b) ->
                Integer.compare(b.getKeywordCount(), a.getKeywordCount()));

        System.out.println("\n=== Sorted Candidates ===");
        sortedCandidates.forEach(System.out::println);
    }

    // Read file using I/O Streams
    private static String readFile(File file) throws IOException {
        return new String(Files.readAllBytes(file.toPath()));
    }

    // Extract email, phone, keywords
    private static ResumeData extractResumeData(String content)
            throws InvalidResumeFormatException {

        Matcher emailMatcher = EMAIL_PATTERN.matcher(content);
        Matcher phoneMatcher = PHONE_PATTERN.matcher(content);

        if (!emailMatcher.find()) {
            throw new InvalidResumeFormatException("Email not found");
        }

        String email = emailMatcher.group();
        String phone = phoneMatcher.find() ? phoneMatcher.group() : "Not Available";

        Set<String> matchedKeywords = new HashSet<>();
        for (String keyword : KEYWORDS) {
            if (Pattern.compile("\\b" + keyword + "\\b", Pattern.CASE_INSENSITIVE)
                    .matcher(content).find()) {
                matchedKeywords.add(keyword);
            }
        }

        return new ResumeData(email, phone, matchedKeywords);
    }	
}