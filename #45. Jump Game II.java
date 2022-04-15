class Solution {
    public int jump(int[] nums) {
        
        int n= nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        dp[n-1]=0;
        
        for(int src=n-1;src>=0;src--)
        {
            if(nums[src]>0)
            {
                int min= Integer.MAX_VALUE;
            for(int jump=1;jump<= nums[src] && src+jump<n;jump++)
            {
                if(dp[jump+src]!=-1)
                {
                    min= Math.min(dp[jump+src] , min);
                }
            }
                if(min!=Integer.MAX_VALUE)
                  dp[src]=min+1;
        }
                
        }
        return dp[0];
    }
}
