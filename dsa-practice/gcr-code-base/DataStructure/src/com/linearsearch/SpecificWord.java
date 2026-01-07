package com.linearsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecificWord {
    public static void main(String[] args) throws Exception {
    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.println("Enter string");
    	String s = read.readLine();
    	System.out.println("Enter string");
    	String f = read.readLine();
    	
    	System.out.println(word(s,f));
    }
    public static String word(String s,String f) {
    	String[] str = s.split(" ");
    	for(int i =0;i<str.length;i++) {
    		if(f.equalsIgnoreCase(str[i])) {
    			return s;
    		}
    	}
    	return "Word Not Found";
    }
}