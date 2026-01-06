package com.stringbuilder;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a String");
		String s  =sc.next();
		sc.nextLine();
		
System.out.println("String with duplicate: "+s);
		
		System.out.println("\nString after removing duplicate: "+removeDupli(s));
	}
	public static String removeDupli(String s) {
		char st[] = s.toCharArray();
		
		Set<Character> ch = new HashSet<>();
		
		StringBuilder ans = new StringBuilder();
		
		for(Character c: st) {
			if(!ch.contains(c))
				ans.append(c);
			ch.add(c);
		}		
		
		return ans.toString();
	}
}
