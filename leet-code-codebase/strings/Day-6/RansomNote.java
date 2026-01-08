/*
383. Ransom Note
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
*/
class RansomNote {
     public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map =new HashMap<>();
        char rs,mz;
        for(int i=0;i<magazine.length();++i){
            mz=magazine.charAt(i);
            map.put(mz,map.getOrDefault(mz,0)+1);
        }
        for(int i=0;i<ransomNote.length();++i){
            rs=ransomNote.charAt(i);
            if ( !map.containsKey(rs)||map.get(rs)==0) {
                return false;

            }map.put(rs,map.get(rs)-1);
        }
        return true;
    }
}