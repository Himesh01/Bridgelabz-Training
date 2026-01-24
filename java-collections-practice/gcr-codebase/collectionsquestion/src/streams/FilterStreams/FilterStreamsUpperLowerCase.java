package streams.FilterStreams;

import java.io.*;

public class FilterStreamsUpperLowerCase {

    public static void main(String[] args) {

        String sourceFile = "input.txt";
        String destinationFile = "output.txt";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw =
                     new BufferedWriter(new FileWriter(destinationFile))) {

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();  
            }

            System.out.println("File converted successfully to lowercase in: "
                    + destinationFile);

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
