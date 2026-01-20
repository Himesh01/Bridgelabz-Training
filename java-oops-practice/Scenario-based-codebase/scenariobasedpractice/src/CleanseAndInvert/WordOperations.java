package CleanseAndInvert;
import java.util.*;

public class WordOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String s = sc.nextLine();
		System.out.println(CleanseAndInvert(s));
		sc.close();
	}
	
	public static String CleanseAndInvert(String s) {
		if(s.contains(" ")) {
			return "Invalid Input!!";
		}
		if(s == null || s.length() <6){
			return "Invalid Input!!";
		}
		
		String lower = s.toLowerCase();
		
		for (int i = 0; i < lower.length(); i++) {
	        char ch = lower.charAt(i);

	        if (!Character.isLetter(ch)) {
	            return ""; 
	        }
	    }
		StringBuilder sb = new StringBuilder();
		for(char c : lower.toCharArray()) {
			if((int) c % 2 !=0) {
				sb.append(c);
			}
		}
		String oddString = sb.toString();
		String reversed = new StringBuilder(oddString).reverse().toString();
		
		StringBuilder evenPositioned = new StringBuilder();
		for(int i =0; i<reversed.length();i++) {
			char c = reversed.charAt(i);
			if(i % 2 ==0) {
				evenPositioned.append(Character.toUpperCase(c));
			}
			else {
				evenPositioned.append(c);
			}
		}
		return evenPositioned.toString();
	}
}
