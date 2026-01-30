package scenarioproblems.MarkMate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.util.*;

public class MarkMate {

    public static void main(String[] args) {

        List<ReportCard> reportCards = new ArrayList<>();
        String csvFile = "marks.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String line = br.readLine(); 

            while ((line = br.readLine()) != null) {

                try {
                    String[] data = line.split(",");

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];

                    int maths = Integer.parseInt(data[2]);
                    int science = Integer.parseInt(data[3]);
                    int english = Integer.parseInt(data[4]);

                    int total = maths + science + english;
                    double average = total / 3.0;
                    String grade = calculateGrade(average);

                    reportCards.add(
                            new ReportCard(id, name, total, average, grade)
                    );

                } catch (NumberFormatException e) {
                    System.out.println("⚠ Invalid marks entry skipped: " + line);
                }
            }

            exportToJson(reportCards);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String calculateGrade(double avg) {
        if (avg >= 85) return "A";
        if (avg >= 70) return "B";
        if (avg >= 50) return "C";
        return "D";
    }

    private static void exportToJson(List<ReportCard> reportCards) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(new File("report-card.json"), reportCards);

        System.out.println("✅ JSON report card generated successfully!");
    }
}