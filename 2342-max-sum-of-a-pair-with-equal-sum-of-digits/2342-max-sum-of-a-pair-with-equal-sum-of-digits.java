class Solution {
    public int maximumSum(int[] nums) {
        int maxSum = -1 ;
        HashMap<Integer , PriorityQueue<Integer>> sumOfDigitsFreq = new HashMap<>();
        for(int num : nums){
            int sum = sumOfDigits(num);
            if(sumOfDigitsFreq.containsKey(sum))
                sumOfDigitsFreq.get(sum).add(num);
            else {
                sumOfDigitsFreq.put(sum , new PriorityQueue<>((a , b) -> b - a)); ;
                sumOfDigitsFreq.get(sum).add(num);
            }
        }
        for(int sum : sumOfDigitsFreq.keySet()){
            PriorityQueue<Integer> pq = sumOfDigitsFreq.get(sum);
            if(pq.size() > 1){
                int first = pq.poll();
                int second = pq.poll();
                maxSum = Math.max(maxSum , first + second);
            }
        }

        return maxSum;
    }
    private int sumOfDigits(int num){
        int res = 0 ;
        while(num > 0){
            res += num % 10 ;
            num = num / 10 ;
        }
        return res ;
    }


}