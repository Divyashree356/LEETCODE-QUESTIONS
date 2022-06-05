class Solution {
    
    public class pair{
        int i;
        int j;
        pair(int x , int y)
        {
            i=x;
            j=y;
        }
    }
    
    public int init(Queue<pair> q , int[][] grid)
    {
        int f=0;
        for(int i=0;i<grid.length;i++)
        {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]==2)
              q.add(new pair(i , j));
            else if(grid[i][j]==1)
                f++;
        }
        }
        return f;
    }
    int[][] dir={{0,1} ,{1,0} ,{-1,0} ,{0,-1}};
    public int orangesRotting(int[][] grid) {
        Queue<pair> q= new LinkedList<>();
        int freshOranges= init(q, grid);
        
        if(freshOranges==0) 
             return 0;
        
        int time=0;
        
        while(!q.isEmpty())
        {
            int size= q.size();
            while(size-->0)
            {
               pair rem= q.poll();
                int i=rem.i;
                int j=rem.j;
                
                if(grid[i][j]==1)
                {
                       freshOranges--;
                        grid[i][j]=2;
                }
                
                if(freshOranges==0)
                     return time;
                
                for(int[]d: dir)
                {
                    int r=i+d[0];
                    int c= j+d[1];
                    
                    if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c]==1)
                    {
                        q.add(new pair(r,c));

                    }
                }
            }
            time++;
        }
  return freshOranges!=0?-1:time;        
        
    }
}
