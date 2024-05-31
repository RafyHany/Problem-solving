class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int XOR = 0 ;
        for(int num : nums)
            XOR ^= num ;   // XOR >> first ^ second

        int res1 =  0 ;
        int differentBit = getMostSetRight(XOR) ;  // already the two number differ at some one this we want to know its position
        for(int num : nums){
            if((num & differentBit) != 0)
                res1 ^= num ;
        }
        res[0] = res1 ;
        res[1] = XOR ^ res1 ;
        return res ;
    }
    private int getMostSetRight(int num){ // to know the first 1 from right
        return (num & -num);
    }
}