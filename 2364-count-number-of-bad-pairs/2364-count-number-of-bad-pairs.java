class Solution {
    public long countBadPairs(int[] nums) {
        long numberOfBadPairs = 0 ;
        int n = nums.length;
        HashMap<Integer , Integer> freqOfDifference = new HashMap<>() ;
        int[] difference = new int[n] ;
        for(int i = 0 ; i < n ; i++)
            difference[i] = nums[i] - i ;
        for(int diff : difference)
            freqOfDifference.put(diff , freqOfDifference.getOrDefault( diff , 0) + 1);
        for(int i = 0 ; i < n - 1; i++){
            int freq = freqOfDifference.get(difference[i]) ;
            int badPairs = n - i - freq ;
            numberOfBadPairs += badPairs ;
            freqOfDifference.put(difference[i] , freq - 1);
        }
        return numberOfBadPairs;
    }
}