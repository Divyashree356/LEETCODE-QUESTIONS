class Solution {
    
    public int combinationSum4(int[] nums, int target) {
        
        int[]dp =new int[target+1];
        Arrays.fill(dp , -1);
        dp[0]=1;
        return combinations(nums , target , dp);
        
    }
    private int combinations(int[]nums ,int target , int[]dp)
    {
        if(dp[target]!=-1)
            return dp[target];
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target >= nums[i])
            {
                res+=combinations(nums ,target-nums[i] , dp);
            }
        }
        dp[target]=res;
        return res;
    }
}
