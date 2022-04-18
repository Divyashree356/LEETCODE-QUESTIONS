class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        if(n==0 || m==0 || matrix==null)
            return 0;
        int[][] dp= new int[n+1][m+1];
        int maxSquare=0;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(matrix[i-1][j-1]=='1')
                {
                    dp[i][j]=Math.min(dp[i-1][j-1] ,Math.min(dp[i-1][j] , dp[i][j-1]))+1;
                    maxSquare=Math.max(maxSquare , dp[i][j]);
                 }
            }
    }
    return maxSquare*maxSquare;

    }
}
