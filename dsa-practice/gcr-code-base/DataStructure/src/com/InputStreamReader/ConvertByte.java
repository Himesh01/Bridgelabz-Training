package com.InputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ConvertByte {
	public static void main(String[] args) throws Exception{

        String filePath = "File/Name.txt"; // UTF-8 encoded file

      
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
      

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

      
    }
}