import java.util.*;

public class CompareString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String s1 = sc.next();
		String s2 = sc.next();
		
		boolean equal = compare(s1,s2);
		boolean result = s1.equals(s2);
		System.out.println("Checked by built-in String equals() method, answer is " +s1.equals(s2));
		System.out.println("using the charAt() method, answer is "+equal);
		
		if(result == equal){
			System.out.println("Both results are same");
		}
		else{
			System.out.println("Both results are not same");
		}
	}
	
	//method to compare two strings
	public static boolean compare(String s1, String s2){
		for(int i = 0; i<s1.length(); i++){
			for(int j = 0; j<s2.length(); j++){
				if(s1.charAt(i) != s2.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
}
		