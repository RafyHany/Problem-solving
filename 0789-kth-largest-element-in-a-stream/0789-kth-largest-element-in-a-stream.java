class KthLargest {
    private int k ;
    private PriorityQueue<Integer> minHeap ;

    public KthLargest(int k, int[] nums) {
        this.k = k ;
        minHeap = new PriorityQueue<>() ;
        for(int num : nums ){
            if(minHeap.size() < this.k)
                minHeap.offer(num);
            else if (minHeap.peek() < num) {
                minHeap.poll() ;
                minHeap.offer(num);
            }
        }
    }

    public int add(int val) {
        if(minHeap.size() < this.k)
            minHeap.offer(val);
        else if (minHeap.peek() < val) {
            minHeap.poll() ;
            minHeap.offer(val);
        }
        return minHeap.peek() ;
    }
}
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */