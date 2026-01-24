package streams.CountWordInAFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountWord {

	 public static void main(String[] args) {

	        String filePath = "input.txt";  

	        HashMap<String, Integer> wordCount = new HashMap<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

	            String line;

	            while ((line = br.readLine()) != null) {

	                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");

	                String[] words = line.split("\\s+");

	                for (String word : words) {
	                    if (!word.isEmpty()) {
	                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }

	            System.out.println("Total unique words: " + wordCount.size());

	            List<Map.Entry<String, Integer>> list =
	                    new ArrayList<>(wordCount.entrySet());

	            list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

	            System.out.println("\nTop 5 most frequent words:");

	            for (int i = 0; i < Math.min(5, list.size()); i++) {
	                System.out.println(
	                        list.get(i).getKey() + " → " + list.get(i).getValue()
	                );
	            }

	        } catch (IOException e) {
	            System.out.println("IO Error: " + e.getMessage());
	        }
	    }
	}