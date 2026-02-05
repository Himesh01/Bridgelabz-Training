package logicalQuestion.listTomap;
import java.util.*;
import java.util.stream.*;

public class ListToMap {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java","Python","c++","HTML");
		
		Map<String,Integer> map = list.stream()
				.collect(Collectors.toMap(s -> s, s -> s.length()));
		System.out.println(map);
	}
}
