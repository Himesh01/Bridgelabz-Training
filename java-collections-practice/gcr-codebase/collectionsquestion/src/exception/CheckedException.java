package exception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("file.txt"));
			String line;
			
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		}
		catch(IOException e) {
			System.out.println("Exception handled: " + e.getClass().getName());
			System.out.println("File not found");
		}
		
		finally {
			try {
				if(br != null)
					br.close();
			}
			catch(IOException e) {
				System.out.println("Error closing file");
			}
		}
	}
}
