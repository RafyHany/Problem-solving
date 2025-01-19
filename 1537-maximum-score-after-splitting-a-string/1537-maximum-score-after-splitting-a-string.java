class Solution {
    public int maxScore(String s) {
        int[] prefixOfOne = new int[s.length() + 1];
        for(int i = prefixOfOne.length - 2   ; i >= 0 ; i--){
            if(s.charAt(i) == '1')
                prefixOfOne[i] = 1 + prefixOfOne[i+1];
            else
                prefixOfOne[i] = prefixOfOne[i+1];    
        }
        int maxSum = 0 ;
        int numberOfZeros = 0 ;
        for(int i = 0 ; i < s.length() - 1 ; ++i ){
            if(s.charAt(i) == '0')
                numberOfZeros ++;
            maxSum = Math.max(maxSum , numberOfZeros + prefixOfOne[i+1]) ;
        }
        return maxSum ;
    }
}