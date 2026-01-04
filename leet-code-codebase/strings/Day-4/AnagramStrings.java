/*
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*/

class AnagramStrings {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()) return false;
     char[] a = s.toCharArray();
     char[] b = t.toCharArray();
     Arrays.sort(a);
     Arrays.sort(b);
     for(int i=0; i<a.length;i++){
        if(a[i]!=b[i]) return false;
     }
     return true;
    }
}