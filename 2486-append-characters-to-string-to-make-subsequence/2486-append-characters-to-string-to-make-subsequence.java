class Solution {
    public int appendCharacters(String s, String t) {
        int ptrS = 0 , ptrT = 0 ;
        while(ptrS < s.length() && ptrT < t.length()){
            if(s.charAt(ptrS) == t.charAt(ptrT)){
                ptrS++ ;
                ptrT++ ;
            }else 
               ptrS++; 
        }
        return t.length() - ptrT ;
    }
}