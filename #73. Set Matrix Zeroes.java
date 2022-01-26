                #MEDIUM
              
Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]



class Solution {
    public void setZeroes(int[][] matrix) {
        int col1= 1 , row=matrix.length , col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            if(matrix[i][0]==0)col1=0;
            for(int j=1;j<col;j++)
            {
                if(matrix[i][j]==0)
                    matrix[i][0] =matrix[0][j] =0;
                }
        }
        for(int i=row-1;i>=0;i--)
        {
            for(int j=col-1;j>=1;j--)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
            if(col1==0)
                matrix[i][0]=0;
        }
    }

    }
