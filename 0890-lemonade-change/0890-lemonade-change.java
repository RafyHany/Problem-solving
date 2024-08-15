class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0 ;
        int tens = 0 ;
        for(int x : bills){
            if(x == 5)
                fives ++ ;
            else if (x == 10) {
                if(fives == 0)
                    return false ;
                fives -- ;
                tens ++ ;
            }else {
                if(tens > 0 && fives > 0){
                    tens -- ;
                    fives -- ;
                }else if(fives >= 3)
                    fives -= 3 ;
                else 
                    return false ;
            }
        }
        return true ;
    }
}