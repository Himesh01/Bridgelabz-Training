package streams.BufferedStreams;
import java.io.*;

public class  BufferedStreamsEfficientFileCopy {

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {

        String sourceFile = "large_input_file.dat";
        String bufferedCopy = "buffered_copy.dat";
        String normalCopy = "normal_copy.dat";

        try {
            long startBuffered = System.nanoTime();
            copyWithBufferedStreams(sourceFile, bufferedCopy);
            long endBuffered = System.nanoTime();

            long bufferedTime = endBuffered - startBuffered;

            long startNormal = System.nanoTime();
            copyWithNormalStreams(sourceFile, normalCopy);
            long endNormal = System.nanoTime();

            long normalTime = endNormal - startNormal;

            System.out.println("\n=== Performance Comparison ===");
            System.out.println("Buffered Streams Time : " + bufferedTime / 1_000_000 + " ms");
            System.out.println("Normal Streams Time   : " + normalTime / 1_000_000 + " ms");

            if (bufferedTime < normalTime) {
                System.out.println("Buffered streams were FASTER ");
            } else {
                System.out.println("Normal streams were FASTER (rare case) ");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void copyWithBufferedStreams(String src, String dest) throws IOException {

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }

        System.out.println("Buffered copy completed.");
    }

    public static void copyWithNormalStreams(String src, String dest) throws IOException {

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }

        System.out.println("Normal copy completed.");
    }
}