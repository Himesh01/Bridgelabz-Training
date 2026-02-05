package logicalQuestion.listTomap;
import java.util.*;
import java.util.stream.*;

public class ListOfIntegersToMap {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,5,6,7);
		
		Map<Integer,Integer> map =list.stream().collect(Collectors.toMap(n -> n, n -> n*n));
		System.out.println(map);
	}
}
