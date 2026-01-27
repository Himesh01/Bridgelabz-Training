package iostreampractice.csv.BasicProblems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCountRows {
	public static void main(String[] args) {
		String filePath = "employee.csv";
		int count =0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line;
			boolean isHeader = true;
			while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                count++;
            }

            System.out.println("Number of records: " + count);

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            System.out.println("Exception: " + e.getClass().getName());
        }	
	}
}
