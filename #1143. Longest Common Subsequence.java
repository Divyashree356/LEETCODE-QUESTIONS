class Solution {
    // int[][]dp;
    public int longestCommonSubsequence(String text1, String text2) {
        
       int[][] dp=new int[text1.length()+1][text2.length()+1];
        int m=text1.length();
        int n=text2.length();
        
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                {   
                    dp[i][j]=0;
                    continue;
                }
            
                if(text1.charAt(i-1)==text2.charAt(j-1))
                  dp[i][j]= 1+ dp[i-1][j-1];
                else 
                {
                    dp[i][j]=Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
    return dp[m][n];
 }
    
//memoization    
//      private int getLength(String t1 , String t2 , int m , int n, int[][] dp)
//      {
//          if(n==0 || m==0)
//              return 0;
         
//          if(dp[m][n]!=-1)
//              return dp[m][n];
         
//          if(t1.charAt(m-1) == t2.charAt(n-1))
//              return dp[m][n]=1+ getLength(t1 , t2 , m-1 , n-1 ,dp);
//          else
//              return dp[m][n]= Math.max(getLength(t1, t2 , m-1 , n, dp) , getLength(t1, t2, m, n-1, dp));
//      }
    
    
//tle recursive approach
//     private int getLength(String t1 , String t2 , int m , int n)
//     {
//         if(n==0 || m==0)
//             return 0;
        
//         if(t1.charAt(m-1)==t2.charAt(n-1))
//             return 1+getLength(t1 , t2 , m-1 , n-1);
        
//         else
//             return Math.max(getLength(t1,t2, m-1, n), getLength(t1, t2, m , n-1) );
//     }
    
}
