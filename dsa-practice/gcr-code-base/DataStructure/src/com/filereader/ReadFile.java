package com.filereader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        String filePath = "example.txt";

        try {
            FileReader fileReader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
