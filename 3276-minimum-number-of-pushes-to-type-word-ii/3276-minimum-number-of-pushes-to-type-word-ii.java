class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26] ;
        for(int i = 0 ; i < word.length() ; ++i)
            freq[(int)word.charAt(i) - 97] ++ ;
        
        Arrays.sort(freq);
        int numberOfCharacterPerKey = 0 ;
        int res = 0 ;
        for(int i = freq.length - 1; i >= 0 ; i--){
            if(freq[i] == 0)
                break;
            res += ((numberOfCharacterPerKey++/8)+1) * freq[i];
        }
        return  res ;
    }
    
}