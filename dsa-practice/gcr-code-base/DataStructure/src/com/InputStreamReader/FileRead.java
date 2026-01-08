package com.InputStreamReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("File/Name.txt"));
		
		String line;
		while((line=read.readLine())!=null) {
			System.out.println(line);
		}
	}
}