package com.stringbuilder;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string to reverse: ");
		String str = sc.next();
		
		System.out.println("given string :"+str);
		StringBuilder st = new StringBuilder(str);
		
		st.reverse();
		System.out.println("reversed string: "+st.toString());
	}
}
