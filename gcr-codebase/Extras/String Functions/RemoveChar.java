import java.util.*;
public class RemoveChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		
		System.out.println("The new String is "+remove(s,ch));
	}
	
	public static String remove(String s,char ch){
		StringBuilder str = new StringBuilder();
		for(char a: s.toCharArray()){
			if(a!=ch){
				str.append(""+a);
			}
		}
		return str.toString();
	}
}