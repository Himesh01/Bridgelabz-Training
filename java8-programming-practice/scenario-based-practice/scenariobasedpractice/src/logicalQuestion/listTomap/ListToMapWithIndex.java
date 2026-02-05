package logicalQuestion.listTomap;
import java.util.*;
import java.util.stream.*;

public class ListToMapWithIndex {
	public static void main(String[] args) {
		
		List<String>list = Arrays.asList("Himesh","Nag","Lucky");
		
		Map<Integer,String> map = IntStream.range(0, list.size()).boxed().collect(Collectors.toMap(
                        i -> i,
                        list::get
                ));
		System.out.println(map);
	}
}
