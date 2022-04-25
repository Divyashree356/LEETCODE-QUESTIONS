class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int n=nums.length;
        if(n<3)
            return 0;
        
        int[] dp= new int[2];
        dp[0]=Integer.MAX_VALUE;
        int res=0;
        
        for(int i=1;i+1<nums.length;i++)
        {
            if(nums[i]-nums[i-1] == nums[i+1]-nums[i])
            {
                if(dp[0]==nums[i]-nums[i-1])
                {
                    res+=dp[1]+1;
                    dp[1]+=1;
                }
                else
                {
                    dp[0]=nums[i]-nums[i-1];
                    res++;
                    dp[1]=1;
                }
            }
            else
            {
                dp[0]= Integer.MAX_VALUE;
            }
        }
        return res;
    }
}
