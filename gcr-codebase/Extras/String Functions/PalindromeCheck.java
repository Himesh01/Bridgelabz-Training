import java.util.*;
public class PalindromeCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		
		System.out.println("The string is palindromic "+check(s));
	}
	public static boolean check(String s){
		int start =0;
		int end = s.length()-1;
		while(start<=end){
			if(s.charAt(start)!=s.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}