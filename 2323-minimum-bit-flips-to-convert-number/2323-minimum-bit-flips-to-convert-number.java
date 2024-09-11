class Solution {
     public int minBitFlips(int start, int goal) {
        
        return numberOf1s( start ^ goal) ;
    }

    private int numberOf1s(int n ){
        int res = 0 ;
        while (n != 0 ){
            int temp = n ;
            if((temp & 1) == 1)
                res++;
            n = n >> 1;
        }
        return res ;
    }
}