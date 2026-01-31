package collectors.WordFrequencyCounter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFrequencyAnalyzer {
    public static void main(String[] args) {
        WordSource source = new WordSource("Java is fun and Java is powerful");

        Map<String, Integer> wordCounts = Stream.of(source.getText().toLowerCase().split("\\s+"))
            .collect(Collectors.toMap(
                word -> word,
                word -> 1,
                Integer::sum
            ));

        System.out.println("Word Frequencies:");
        wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
