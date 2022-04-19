class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if(nums.length==0)
            return 0;
        // if(nums.length==1 && nums[0]==0)
        //     ret
        int[] dp= new int[nums.length];
        dp[0]=1;
        int totalMax=dp[0];
        
        for(int i=1;i<nums.length;i++)
        {
            int currMax=0;
            for(int j=0;j<i;j++)
            {
                if((nums[j]<nums[i]))
                {
                    if(currMax<dp[j])
                        currMax=dp[j];
                }
            }
            dp[i]=currMax+1;
            
            if(totalMax<dp[i])
                totalMax=dp[i];
        }
        return totalMax;
    }
}
