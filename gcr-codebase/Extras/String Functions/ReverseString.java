import java.util.*;
public class ReverseString{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String s = sc.nextLine();
		String str = reverseString(s);
		System.out.println("Reversed : " + str);
	}
	public static String reverseString(String s){
		String reversed = "";
		for(int i =s.length()-1; i>=0; i--){
			reversed += s.charAt(i);
		}
		return reversed;
	}
}