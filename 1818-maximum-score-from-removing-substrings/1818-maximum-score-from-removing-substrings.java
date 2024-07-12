class Solution {
    
    int res = 0 ;

    public int maximumGain(String s, int x, int y) {
        StringBuilder str = new StringBuilder(s) ;
        if(x > y ){
            StringBuilder temp = maximumGain(str , s , "ab" , x ) ;
            maximumGain(temp , s , "ba" , y );
        }else{
            StringBuilder temp = maximumGain(str , s , "ba" , y ) ;
            maximumGain(temp , s , "ab" , x );
        }
        return  res ;
    }
    public StringBuilder maximumGain(StringBuilder str ,String s , String sub, int val ) {
        int len = str.length(); ;
        for(int i = 0 ; i < len ; ++i ){
            if(str.charAt(i) == sub.charAt(0) ){
                if(i + 1 < len &&  str.charAt(i+1) == sub.charAt(1)){
                    res += val ;
                    str.delete(i , i+2) ;
                    len -= 2 ;
                    i -=2;
                    if(i < 0 )
                        i = -1 ;
                }
            }
        }
        return  str ;
    }
}






