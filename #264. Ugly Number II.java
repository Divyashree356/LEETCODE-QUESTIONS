class Solution {
    public int nthUglyNumber(int n) {
        
        int[] dp=new int[n];
        dp[0]=1;
        int pf2=0 , pf3=0 , pf5=0;
        for(int i=1;i<n;i++)
        {
            dp[i]=Math.min(dp[pf2]*2 , Math.min(dp[pf3]*3 , dp[pf5]*5));
            
            if(dp[i]==(dp[pf2]*2))
                pf2++;
            
            if(dp[i]==(dp[pf3]*3))
                pf3++;
            
            if(dp[i]==(dp[pf5]*5))
                pf5++;
        }
        return dp[n-1];
    }
}
