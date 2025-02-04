class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(int num : nums)
            freq.put(num , freq.getOrDefault(num , 0) + 1) ;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) -> freq.get(a) - freq.get(b));
        for(int num : freq.keySet()){
            pq.add(num);
            if(pq.size() > k) pq.poll();
        }
        int[] res = new int[k];
        for(int num : pq)
            res[--k] = num;
        
        return res;
    }
}