class Solution {
    public int findLongestChain(int[][] pairs) {
       
        int[] dp=  new int[pairs.length];
        Arrays.fill(dp , 1);
        Arrays.sort(pairs , (a,b)->
                    {
                       return a[0]-b[0]; 
                    });
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<i;j++)
            {
             dp[i]= Math.max(dp[i] , pairs[j][1]<pairs[i][0]?dp[j]+1:dp[j]);
            }
        }
        return dp[pairs.length-1];
    }
    
}
