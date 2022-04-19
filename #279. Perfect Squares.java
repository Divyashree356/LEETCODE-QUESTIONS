class Solution {
    public int numSquares(int n) {
        
        int[]dp= new int[n+1];
        Arrays.fill(dp , Integer.MAX_VALUE);
        dp[0]=0;
        
        int count=1;
        while(count*count<=n)
        {
            int perfSq= count*count;
            for(int i=perfSq;i<=n;i++)
            {
                dp[i]=Math.min(dp[i-perfSq]+1, dp[i]);
            }
            count++;
        }
        return dp[n];
    }
}
