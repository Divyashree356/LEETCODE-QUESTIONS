      #MEDIUM

Input
["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
[[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
Output
[null, 8, 11, 12]

Explanation
NumMatrix numMatrix = new NumMatrix([[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]);
numMatrix.sumRegion(2, 1, 4, 3); // return 8 (i.e sum of the red rectangle)
numMatrix.sumRegion(1, 1, 2, 2); // return 11 (i.e sum of the green rectangle)
numMatrix.sumRegion(1, 2, 2, 4); // return 12 (i.e sum of the blue rectangle)


class NumMatrix {
int[][] matrix;
    public NumMatrix(int[][] matrix) 
    {
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
            matrix[i][j]+=matrix[i][j-1];
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]+=matrix[i-1][j];
            }
        }
         this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2)
    {
     int total=matrix[row2][col2];
    int error=0;
     
     error=(col1!=0?matrix[row2][col1-1]:0) +(row1!=0?matrix[row1-1][col2]:0 )-
         ((row1!=0 && col1!=0)?matrix[row1-1][col1-1]:0);
        
        return total-error;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
