class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odds = 0 ;
        for(int ele : arr){
            odds = ele % 2 == 0 ? 0 : odds + 1 ;
            if(odds % 3 == 0 && odds != 0 )
                return true ;
        }
        return false ;
    }
}