import java.util.*;
public class ToggleCase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");

		String s = sc.next();
		
		System.out.println("New String is "+toggle(s));
	}
	public static String toggle(String s){
		String str = "";
		for(char a: s.toCharArray()){
			if(Character.isUpperCase(a)){
				char ch = Character.toLowerCase(a);
				str+=""+ch;
			}else{
				char ch = Character.toUpperCase(a);
				str+=""+ch;
			}
		}
		return str;
	}
}