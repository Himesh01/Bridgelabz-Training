package streams.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingReadandWriteFile {

    public static void main(String[] args) {

        String sourcePath = "source.txt";     
        String destinationPath = "destination.txt"; 

        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist: " + sourcePath);
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully to: " + destinationPath);

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}