class IndexOfFirstOcc {
    public int strStr(String haystack, String needle) {
        int n;
        if(haystack.contains(needle)){
            n= haystack.indexOf(needle);
            return n;
        }else{
            return -1;
        }
    }
}