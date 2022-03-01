class Solution {
    public boolean subSets(int[] nums ,boolean[][] dp )
    {   
      int n=dp.length;
      int m = dp[0].length;
     dp[0][0]=true;
        
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          if(j==0)
            dp[i][j]=true;
            
          else if(i==0)
             dp[i][j]=false;
            
         else
         {
        dp[i][j]= dp[i-1][j];
            if(j>=nums[i-1])
            {
                dp[i][j]= (dp[i-1][j-nums[i-1]] || dp[i][j]);
            }
        }
        }
      }
return dp[n-1][m-1];
    }
    public boolean canPartition(int[] nums) {
        int n= nums.length;
        int sum=0;
        for(int num:nums)
            sum+=num;
        
        if(sum%2 != 0 )
         return false;
        
        sum/=2;
        
       boolean[][] dp= new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
         Arrays.fill(dp[i] , false);
        
        return subSets(nums , dp);
    }
}
