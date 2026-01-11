package com.timeComplexity;
import java.io.*;

public class FileReadingPerformance {

    private static final String FILE_PATH = "largefile.txt"; // e.g. 1MB / 100MB / 500MB

    // FileReader
    public static void readUsingFileReader() throws IOException {
        try (FileReader fr = new FileReader(FILE_PATH)) {
            while (fr.read() != -1) {
            }
        }
    }

    //  InputStreamReader 
    public static void readUsingInputStreamReader() throws IOException {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(FILE_PATH))) {
            while (isr.read() != -1) {
            }
        }
    }

    public static void main(String[] args) {

        try {
            //  FileReader Timing 
            long startFR = System.nanoTime();
            readUsingFileReader();
            long endFR = System.nanoTime();

            System.out.println("FileReader Time: " + (endFR - startFR) / 1_000_000.0 + " ms");

            //InputStreamReader Timing
            long startISR = System.nanoTime();
            readUsingInputStreamReader();
            long endISR = System.nanoTime();

            System.out.println("InputStreamReader Time: " + (endISR - startISR) / 1_000_000.0 + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}