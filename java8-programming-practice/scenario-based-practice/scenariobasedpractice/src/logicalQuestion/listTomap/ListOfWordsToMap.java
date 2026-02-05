package logicalQuestion.listTomap;
import java.util.*;
import java.util.stream.*;

public class ListOfWordsToMap {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList(
				"Himesh","Nag","Lucky","Himesh","Lucky","Raj","Raj"
				);
		Map<String,Long> map =words.stream().collect(Collectors.groupingBy(
				word -> word,
				Collectors.counting()
				));
		System.out.println(map);
	}
}
