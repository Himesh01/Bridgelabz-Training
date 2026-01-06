package com.stringBuffer;
import java.util.*;

public class StringConcatenate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s1 = sc.next();
		sc.nextLine();
		
		System.out.print("Enter another string: ");
		String s2 = sc.next();
		sc.nextLine();
		
		String ans = concatenateString(s1, s2);
		
		System.out.println("String after concatenation: "+ans);
	}
	public static String concatenateString(String s1, String s2) {
		StringBuffer sb = new StringBuffer(s1);
		
		sb.append(s2);
		
		return sb.toString();
	}
}
