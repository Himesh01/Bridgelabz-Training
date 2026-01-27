package iostreampractice.csv.IntermediateProblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchRecords {
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("userData.csv"))) {
			String name="Himesh";
			boolean isHeader=true;
			boolean found =false;
			
			String line;
			while((line=br.readLine())!=null) {
				String s[] = line.split(",");
				
				if(s[1].trim().equalsIgnoreCase(name)) {
					found =true;
					System.out.println("Name: "+s[1].trim()+", Dept: "+s[2].trim()
							+", Salary: "+s[3].trim());
					break;
				}
			}
			if(!found) {
				System.out.println("Record not found!");
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}