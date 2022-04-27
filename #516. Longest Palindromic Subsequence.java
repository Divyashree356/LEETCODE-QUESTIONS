class Solution {
    public int longestPalindromeSubseq(String s) {
      
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            t= ch+t;
        }
        
        int maxLen=getSub(s, t, s.length());
        return maxLen;
    }
    
    private int getSub(String s, String t , int n)
    {
        int[][] dp= new int[n+1][n+1];
        
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                    continue;
                }
                
                if(s.charAt(i-1)== t.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]= Math.max(dp[i][j-1] , dp[i-1][j]);
            }
        }
        return dp[n][n];
    }
}
