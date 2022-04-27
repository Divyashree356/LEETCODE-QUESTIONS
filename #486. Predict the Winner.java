class Solution {
    public boolean PredictTheWinner(int[] nums) {
        
        int total=0;
        for(int n: nums)
            total+=n;
        
        int maxScore= calculate(nums ,0 , nums.length-1 , 0);
        total-=maxScore;
        
        return maxScore>=total;
    }
    private int calculate(int[] nums , int left , int right , int chance)
    {
        if(left>right)
            return 0;
        if(chance==0)
            return Math.max(nums[left]+calculate(nums , left+1 , right , 1) ,
                       nums[right]+calculate(nums , left , right-1 , 1));
       else
return Math.min(calculate(nums ,left+1 , right , 0) , calculate(nums, left , right-1 , 0));
            
    }
}
