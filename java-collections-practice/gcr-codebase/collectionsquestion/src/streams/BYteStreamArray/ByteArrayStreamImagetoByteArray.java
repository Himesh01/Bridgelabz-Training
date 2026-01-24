package streams.BYteStreamArray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayStreamImagetoByteArray {

    public static void main(String[] args) {

        String sourceImage = "hhh.jpg";   //Original file
        String newImage = "copy.jpg";         

        try {
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            fis.close();

            byte[] imageBytes = baos.toByteArray();
            baos.close();

            System.out.println("Image converted to byte array. Size: "
                    + imageBytes.length + " bytes");

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(newImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("New image created successfully: " + newImage);

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}