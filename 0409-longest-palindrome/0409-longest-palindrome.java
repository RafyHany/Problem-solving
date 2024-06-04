class Solution {
    public int longestPalindrome(String s) {
        int res = 0 ;
        int odds = 0 ;
        Map<Character,Integer> freq = new HashMap<>() ;
        for(int i= 0 ; i < s.length() ; ++i ){
            char c = s.charAt(i) ;
            if(freq.containsKey(c)){
                int val = freq.get(c) ;
                if(val % 2 == 0){
                    odds ++ ;
                }else {
                    odds--;
                    res += 2;
                }
                freq.replace(c,val+1);
            }else{
                freq.put(c,1);
                odds++;
            }
        }
        if(odds != 0 )
            odds = 1 ;
        return odds + res ;
    }
}