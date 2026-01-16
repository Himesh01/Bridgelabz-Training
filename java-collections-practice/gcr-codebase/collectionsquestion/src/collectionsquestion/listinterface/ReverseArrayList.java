package collectionsquestion.listinterface;
import java.util.*;

public class ReverseArrayList {
	public static void reverseList(ArrayList<Integer>list) {
		int left =0;
		int right = list.size() -1;
		
		while(left < right) {
			int temp = list.get(left);
			list.set(left,  list.get(right));
			list.set(right , temp);
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));
		System.out.println("Before: "+arr);
		
		reverseList(arr);
		System.out.println("After: "+ arr);
	}
}
