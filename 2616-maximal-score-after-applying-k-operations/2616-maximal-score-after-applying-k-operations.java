class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0 ;
        PriorityQueue<Integer> sortingNums = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums)
            sortingNums.add(num);
        for(int i = 0 ; i < k ; i++){
            int current = sortingNums.poll() ;
            score += current ;
            sortingNums.offer((int)Math.ceil(current/3.0)) ;
        }


        return score ;
    }
}