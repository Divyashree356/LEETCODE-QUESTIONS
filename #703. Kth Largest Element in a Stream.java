class KthLargest {

    private final PriorityQueue<Integer> minPq= new PriorityQueue<>();
    private final int k;
    public KthLargest(int k, int[] nums) {
        
        this.k=k;
        for(int i:nums)
        {
            minPq.add(i);
            if(minPq.size()>k)
                minPq.poll();
        }
    }
    
    public int add(int val) {
        minPq.add(val);
        if(minPq.size()>k)
        {
            minPq.poll();
        }
        return minPq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
