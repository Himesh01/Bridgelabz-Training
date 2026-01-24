package streams.ReadUserInputFromConsole;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputConsloe {
	
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            FileWriter writer = new FileWriter("user_info.txt");

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            writer.close();   

            System.out.println("\nData saved successfully in user_info.txt");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}