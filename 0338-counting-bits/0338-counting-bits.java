class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1] ;
        res[0] = 0 ;
        for(int i = 1 ; i <= n ; i++){
            int oddBit = 0 ; // if odd then there additional 1 
            if(i % 2 != 0)
                oddBit = 1 ;
            res[i] = res[i>>1] + oddBit ; // to calc current number we do a right shift to get the use of already calculated number + odd bit
        }
        return res ;
    }
}