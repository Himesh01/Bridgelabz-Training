package jUnit.BasicJUnitProblems.TestingFileHandlingMethods;

import java.io.*;

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(content);
        }
    }

    public String readFromFile(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        }
        return sb.toString();
    }
}