class Solution {
    private boolean isSafe(int row , int col , char[][] chessBoard )
    {
        int tempRow = row;
        int tempCol= col;
        
        while(row>=0 && col>=0)
        {
            if(chessBoard[row][col]=='Q')
                return false;
            
            row--;
            col--;
        }
        
        row=tempRow;
        col= tempCol;
        while(col>=0)
        {
            if(chessBoard[row][col]=='Q')
                return false;
            col--;
        }
        
        col=tempCol;
        
        while(row< chessBoard.length && col >=0)
        {
            if(chessBoard[row][col]=='Q')
                return false;
            
            row++;
            col--;
        }
        
        return true;
    }
    private void nQueens(int col ,List<List<String>> result  , char[][] chessBoard)
    {
        if(col == chessBoard.length)
        {
            result.add(constructString(chessBoard));
            return;
        }
        
        for(int r =0; r<chessBoard.length;r++)
        {
            if(isSafe(r , col , chessBoard))
            {
                chessBoard[r][col]='Q';
                nQueens(col+1 ,result,  chessBoard);
                chessBoard[r][col]='.';
            }
        }
    }
    private List<String> constructString(char[][] chessBoard)
    {
        List<String> chessList = new ArrayList<>();
        for(int i=0;i<chessBoard.length;i++)
        {
            String s= new String(chessBoard[i]);
            chessList.add(s);
        }
        return chessList;
    }
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> result = new ArrayList<>();
         char[][] chessBoard = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                chessBoard[i][j]='.';
            }
        }
        nQueens(0 , result , chessBoard);
        return result;
    }
}
