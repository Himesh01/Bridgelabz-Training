package collectionsquestion.listinterface;
import java.util.*;

public class FrequencyCounter {
	public static Map<String, Integer> countFrequency(List<String> list){
		Map<String,Integer> frequencyMap = new HashMap<>();
		
		for(String item :list) {
			frequencyMap.put(item ,  frequencyMap.getOrDefault(item ,  0)+1);
		}
		return frequencyMap;
	}
	public static void main(String[] args) {
		List<String> input  = Arrays.asList("apple","mango","banana","mango");
		
		Map<String,Integer> result = countFrequency(input);
		System.out.println(result);
	}
}
