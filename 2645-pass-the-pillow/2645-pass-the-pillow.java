class Solution {
    public int passThePillow(int n, int time) {
        int index = 1 ;
        int factorOfInc = -1 ;
        while (time > 0){
            if(index == n  || index == 1)
                factorOfInc *= -1 ;
            index += factorOfInc ;
            time-- ;
        }
        return index ;
    }
}