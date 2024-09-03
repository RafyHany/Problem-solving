class Solution {
    public int getLucky(String s, int k) {
        int res = 0 ;
        char[] chars = s.toCharArray() ;
        for(char c : chars ){
            int ansiOoChar = c - 96 ;
            res += (ansiOoChar % 10) ;
            if( ansiOoChar >= 10 )
                res += (ansiOoChar / 10);
        }
        while(--k > 0)
            res = sumOfNumber(res);
        return res ;
        
    }
    private int sumOfNumber(int n){
        int res = 0;
        int numberOfDigits = (int)Math.floor(Math.log10(n)) + 1 ;
        for(int i = 0 ; i < numberOfDigits ; ++i){
            res += (n % 10) ;
            n /= 10 ;
        }
        return res;
    }
}