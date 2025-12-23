import java.util.*;
public class UpperCaseConvert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s+" converted to upper case using user methos  "+toUpper(s));
		System.out.println(s+" converted to in built in method  "+s.toUpperCase());
	}
	public static String toUpper(String s){
		String str ="";
		for(int i =0;i<s.length();i++){
			if(s.charAt(i)==' '){
				str+=""+s.charAt(i);
			}else{
				int a = (int)s.charAt(i)-'a';
				char n = (char)(a+65);
				str+=""+n;
			}
		}
		return str;
	}
}