/*Compare Two Strings

Problem:
Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
*/

import java.util.*;
public class CompareStrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string 1 ");
		String s1 = sc.next();
		
		System.out.println("Enter a string 2 ");
		String s2 = sc.next();
		
		if(s1.equals(lexicographically(s1,s2,0))){
			System.out.println(s1+" comes before "+s2+" in lexicographical order");
		}else{
			System.out.println(s2+" comes before "+s1+" in lexicographical order");
		}
		
	}
	public static String lexicographically(String s1,String s2,int idx){
		if(idx==s1.length()||idx==s2.length()){
			if(s1.length()<s2.length()){
				return s1;
			}else{
				return s2;
			}
		}
		if(s1.charAt(idx)!=s2.charAt(idx)){
			int ch1 = (int)(s1.charAt(idx));
			int ch2 = (int)(s2.charAt(idx));
			if(ch1<ch2){
				return s1;
			}else{
				return s2;
			}
		}
		return lexicographically(s1,s2,idx+1);
	}
}