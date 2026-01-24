package streams.ReadALargeFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadaLargeFileLinebyLine {

	    public static void main(String[] args) {

	        String filePath = "large_log.txt";   

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

	            String line;
	            int count = 0;

	            while ((line = br.readLine()) != null) {

	                if (line.toLowerCase().contains("error")) {
	                    System.out.println(line);
	                    count++;
	                }
	            }

	            System.out.println("\nTotal lines containing 'error': " + count);

	        } catch (IOException e) {
	            System.out.println("IO Error: " + e.getMessage());
	        }
	    }
	}