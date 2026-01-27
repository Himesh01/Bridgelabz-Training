package iostreampractice.csv.BasicProblems;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("employee.csv"))) {

            String line;
            boolean isFirst = true;

            while ((line = br.readLine()) != null) {

                if (isFirst) {
                    isFirst = false;
                    continue;
                }

                String[] st = line.split(",");

                if (st.length < 4) {
                    System.out.println("Invalid row: " + line);
                    continue;
                }

                System.out.println("\nID: " + st[0].trim());
                System.out.println("Name: " + st[1].trim());
                System.out.println("Department: " + st[2].trim());
                System.out.println("Salary: " + st[3].trim());
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}