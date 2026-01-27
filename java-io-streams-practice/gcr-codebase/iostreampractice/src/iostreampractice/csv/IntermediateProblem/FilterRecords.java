package iostreampractice.csv.IntermediateProblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {

    public static void main(String[] args) {

        String filePath = "students.csv"; 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
            	if(isHeader) {
            		isHeader = false;
            		continue;
            	}
            	
            	String s[] = line.split(",");
            	String name = s[0].trim();
            	int marks = Integer.parseInt(s[1].trim());
            	if(marks>=80) {
            		System.out.println("Name: "+name+", marks: "+marks);
            	}
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks format in CSV");
        }
    }
}
