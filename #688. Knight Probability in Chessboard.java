class Solution {
    
    private boolean isValid(int r, int c , int n)
    {
        if(r>=0 && c>=0 && r<n && c<n)
            return true;
        return false;
    }
    public double knightProbability(int n, int k, int row, int column) {
        
        double[][] currP = new double[n][n];
        double[][] nextP = new double[n][n];
        currP[row][column]=1;
        
        int dir[][]={{-2,1}, {-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
        for(int move=1;move<=k;move++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(currP[i][j]!=0)
                    {
                        for(int[] d: dir)
                        {
                            int nr= i+d[0];
                            int nc= j+d[1];
                            if(isValid(nr , nc, n))
                            {
                                nextP[nr][nc]+= currP[i][j]/8.0;
                            }
                        }
                    }
                }
            }
            currP= nextP;
            nextP= new double[n][n];
        }
      double totalP=0.0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                totalP+= currP[i][j];
            }
        }
        return totalP;
    }
}
