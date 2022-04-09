class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums.length==0)
            return new int[k];
        
        HashMap<Integer , Integer> hm= new HashMap<>();
     for(int n: nums)
     {
         hm.put(n , hm.getOrDefault(n , 0)+1);
     }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b)-> hm.get(a)- hm.get(b));
        for(int num : hm.keySet())
        {
            pq.add(num);
                if(pq.size()>k)
                    pq.poll();
        }
        int[] result = new int[k];
        int i=0;
        while(!pq.isEmpty())
        {
            int j= pq.poll();
            result[i++]=j;
        }
        return result;
    }
}
