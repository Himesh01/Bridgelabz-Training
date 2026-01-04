/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
 No two characters may map to the same character, but a character may map to itself.
*/

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[200];
        int[] indexT = new int[200];
        
        int len = s.length();
        
        if(len != t.length()) {
            return false;
        }
        for(int i = 0; i < len; i++) {
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}