package collectionsquestion.mapinterface.WordFrequencyCounter;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static Map<String, Integer> countWords(String text) {

        text = text.toLowerCase();

        text = text.replaceAll("[^a-zA-Z0-9\\s]", "");

        String[] words = text.split("\\s+");

        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {

        String input = "Hello world, hello Java!";

        Map<String, Integer> result = countWords(input);

        System.out.println(result);
    }
}