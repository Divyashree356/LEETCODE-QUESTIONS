class Solution {

public int findTargetSumWays(int[] nums, int target) {
        
        // if(target==0)
        //     return 1;
        
        int sum= 0;
        for(int n: nums)
        {
            sum+=n;
        }
        
        if (target > sum || (target+sum)%2 >0)
            return 0;
    
        if(((target+sum)/2)<0)
            return 0;
    
        return targetSubset(nums , (sum+target)/2);
    }
    
    private int targetSubset(int[] nums , int target)
    {
        int[] dp=new int[target+1];
        dp[0]=1;
        
        for(int i=0;i <nums.length;i++)
        {
            for(int j=target;j>=nums[i];j--)
            {
                dp[j]+=dp[j-nums[i]];
            }
        }
        return dp[target];
    }
}
