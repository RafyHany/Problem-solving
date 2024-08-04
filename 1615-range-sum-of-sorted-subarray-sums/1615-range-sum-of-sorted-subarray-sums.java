class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] subArrays = new int[n * (n + 1) / 2];
        int modules = 1000000007 ;
        int k = 0 ;
        for(int i = 0 ; i < n ; ++i){
            int sum = 0 ;
            for(int j = i ; j < n ; ++j){
                sum += nums[j];
                subArrays[k++] = sum ;
            }
        }
        Arrays.sort(subArrays);
        int sum = 0 ;
        for(int i = left - 1; i < right ;++i)
            sum = (sum + subArrays[i]) % modules;
        return sum ;
    }
}