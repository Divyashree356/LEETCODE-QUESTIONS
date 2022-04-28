class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                    q.add(new int[]{i,j});
                else
                    mat[i][j]=-1;
            }
        }
        int[][] dir= {{0,1} ,{1,0} , {0,-1},{-1,0}};
        int distance=0;
        
        while(!q.isEmpty())
        {
            int size= q.size();
            distance++;
            
            while(size-->0)
            {   int[] currCell= q.poll();
                for(int[] d: dir)
                {
                    int row= currCell[0]+ d[0];
                    int col= currCell[1]+ d[1];
                    
            if(row<0 || col<0 || row>=mat.length|| col>=mat[0].length || mat[row][col]!=-1)
                    continue;
                    
                     mat[row][col]=distance;
                    q.add(new int[]{row , col});
                }
             // size--;
            }
        }
        return mat;
            
    }
}
