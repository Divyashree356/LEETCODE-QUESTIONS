class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0 && coins.length==0)
             return 0;
        
//         if(coins==0)
//           return 1e5;
        
        int n= coins.length;
        int[][] dp=  new int[n+1][amount+1];
        
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                if(j==0)
                 dp[i][j]=0;
                
                else if(i==0)
                  dp[i][j]=(int)1e5;
    
                else if(coins[i-1]>j)
                dp[i][j]= dp[i-1][j];
                
                else
                 dp[i][j]= Math.min(1+dp[i][j-coins[i-1]] , dp[i-1][j]);
            }
        }
        return dp[n][amount]>(int)1e4?-1:dp[n][amount];
    }
}
