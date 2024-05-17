class Solution {
     public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sum = new HashMap<>();
        sum.put(0, 1);
        int currentSum = 0;
        int numberOfArrays = 0;

        for (int i : nums) {
            currentSum += i;
            int diff = currentSum - k;
            if (sum.containsKey(diff))
                numberOfArrays += sum.get(diff);
            if(sum.containsKey(currentSum))
                sum.put(currentSum, sum.get(currentSum) + 1);
            else 
                sum.put(currentSum,1);
        }
        return numberOfArrays;
    }
}