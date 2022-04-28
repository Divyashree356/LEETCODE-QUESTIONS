class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
    int[][] dp= new int[m][n];
    dp[startRow][startColumn]=1;
    int result=0;
    final int mod= 1000000007;
    
    int[][] dir={{0,1} ,{1,0} ,{-1,0} ,{0,-1}};
        
    for(int move=1;move<=maxMove;move++)
    {
    int[][] tempDp= new int[m][n]; 
    for(int r=0;r<m;r++)
        {
        for(int c=0;c<n;c++)
        {
            for(int[]d: dir)
            {
                int nr= r+d[0];
                int nc= c+d[1];
                
                if(nr<0 || nc<0 || nr>=m || nc>=n)
                    result= (result +dp[r][c])%mod;
                else
                    tempDp[nr][nc]= (tempDp[nr][nc] + dp[r][c])% mod;
            }
            
        }
    }
     dp=tempDp;  
    }
        return result;
    }
}
