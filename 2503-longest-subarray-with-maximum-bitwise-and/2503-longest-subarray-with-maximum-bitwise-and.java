class Solution {
    public int longestSubarray(int[] nums) {
        int len = 1;
        int mx = Integer.MIN_VALUE;
        for (int num : nums) 
            mx = Math.max(mx, num);  
        int tempLen= 0;
        for (int num : nums) {  
            if (num == mx) {
                tempLen++;
            } else {
                len = Math.max(len, tempLen);
                tempLen = 0;
            }
        }
        len = Math.max(len, tempLen);
        return len;
    }
}