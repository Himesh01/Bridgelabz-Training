package iostreampractice.csv.AdvancedProblems;

import java.io.*;
import java.util.*;

public class DetectDuplicateCSV {

    public static void main(String[] args) {

        String filePath = "students.csv";

        Set<String> seenIds = new HashSet<>();

        List<String> duplicateRecords = new ArrayList<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath), 1024 * 1024)) {

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] cols = line.split(",", -1);

                if (cols.length == 0) continue;

                String id = cols[0].trim();

                if (!seenIds.add(id)) {
                    duplicateRecords.add(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (duplicateRecords.isEmpty()) {
            System.out.println("No duplicate records found.");
        } else {
            System.out.println("Duplicate records found:");
            for (String record : duplicateRecords) {
                System.out.println(record);
            }
        }
    }
}