package iostreampractice.csv.AdvancedProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCsv {
    public static void main(String[] args) {
        String csvFile = "employee.csv"; 
        String line;
        String csvSplitBy = ",";

        Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
        Pattern phonePattern = Pattern.compile("^\\d{10}$");

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String header = br.readLine(); 
            int rowNum = 1; 

            while ((line = br.readLine()) != null) {
                rowNum++;
                String[] data = line.split(csvSplitBy);

                if (data.length < 5) { 
                    System.out.println("Invalid row (missing columns) at row " + rowNum + ": " + line);
                    continue;
                }

                String name = data[0].trim();
                String department = data[1].trim();
                String salaryStr = data[2].trim();
                String email = data[3].trim();
                String phone = data[4].trim();

                boolean valid = true;

                // Validate Email
                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Invalid email at row " + rowNum + ": " + email);
                    valid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Invalid phone number at row " + rowNum + ": " + phone);
                    valid = false;
                }

                try {
                    Double.parseDouble(salaryStr);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid salary at row " + rowNum + ": " + salaryStr);
                    valid = false;
                }

                if (valid) {
                    System.out.println("Valid row at row " + rowNum + ": " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}