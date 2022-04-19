class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        
        int[] dp = new int[n];
        dp[0]=1;
        // dp[1]=1;
        int[] index= new int[primes.length];
        
        for(int i=1;i<n;i++)
        {   
            dp[i]= Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++)
            {
              dp[i]= Math.min(dp[i] , primes[j]*dp[index[j]]);  
            }
            for(int j=0;j<index.length;j++)
            {
                if(dp[i]== primes[j]*dp[index[j]])
                    index[j]++;
            }
                
        }
        return dp[n-1];
    }
    
}
