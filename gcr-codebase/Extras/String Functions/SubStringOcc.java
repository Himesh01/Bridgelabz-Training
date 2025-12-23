import java.util.*;
public class SubStringOcc{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");

		String s = sc.next();
		String sub = sc.next();
		
		System.out.println("The occurence of the substring is "+check(s,sub));
	}
	public static int check(String s, String sub){
		int len = 0;
		for(int i=0;i<s.length();i++){
			for(int j =i;j<=s.length();j++){
				String str = s.substring(i,j);
				if(str.equals(sub)){
					len++;
				}
			}
		}
		return len;
	}
}