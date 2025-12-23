import java.util.*;
public class CheckPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = sc.next();
		
		System.out.println("Is palindrom by recursion : "+recur(s,0,s.length()-1));
		System.out.println("Is palindrom by String "+palin(s));
		System.out.println("Is palindrom by Array : "+palinArray(s));
	}
	public static boolean recur(String s,int start,int end){
		if(start>end){
			return true;
		}
		if(s.charAt(start)!=s.charAt(end)){
			return false;
		}
		return recur(s,start+1,end-1);
	}
	public static boolean palin(String s){
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
	public static boolean palinArray(String s){
		char[] ch = s.toCharArray();
		int start = 0;
		int end = ch.length-1;
		while(start<=end){
			if(ch[start]!=ch[end]){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}