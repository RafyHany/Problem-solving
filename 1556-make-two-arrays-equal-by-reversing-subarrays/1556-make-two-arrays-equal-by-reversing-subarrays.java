class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[]freq = new int[1001];
        for(int x : target)
            freq[x]++;
        for(int x : arr){
            if(freq[x]==0)
                return false ;
            freq[x]--;
        }
        return true ;
    }
}