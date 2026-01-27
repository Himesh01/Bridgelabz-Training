package iostreampractice.csv.AdvancedProblems;

import java.io.*;
import java.util.*;

public class LargeCSVReader {

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "userData.csv";
        int totalProcessed = 0;

        List<String> chunk = new ArrayList<>(CHUNK_SIZE);

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath), 1024 * 1024)) {

            String line = br.readLine();
            if (line == null) {
                System.out.println("CSV file is empty");
                return;
            }

            while ((line = br.readLine()) != null) {
                chunk.add(line);

                if (chunk.size() == CHUNK_SIZE) {
                    processChunk(chunk);
                    totalProcessed += chunk.size();
                    System.out.println("Records processed: " + totalProcessed);
                    chunk.clear();
                }
            }

            if (!chunk.isEmpty()) {
                processChunk(chunk);
                totalProcessed += chunk.size();
                System.out.println("Records processed: " + totalProcessed);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processChunk(List<String> chunk) {
        for (String record : chunk) {

            String[] cols = record.split(",", -1);

            if (cols.length < 4) {
                System.out.println("Invalid row: " + record);
                continue;
            }

            String id = cols[0].trim();
            String name = cols[1].trim();
            int age;
            String email = cols[3].trim();

            try {
                age = Integer.parseInt(cols[2].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid age in row: " + record);
                continue;
            }

            System.out.println(
                "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Email: " + email
            );
        }
    }
}