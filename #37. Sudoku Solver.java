class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    public boolean solve(char[][] board)
    {
        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
                if(board[r][c]=='.')
                {
                    for(char ch='1';ch<='9';ch++)
                    {
                        if(isSafe(board , r , c , ch))
                        {
                            board[r][c]=ch;
                            
                            if(solve(board)==true)
                                return true;
                            else
                                board[r][c]='.';
                        }
                    }
                    return false;
                }
                
            }
        }
        return true;
    }
    
    public boolean isSafe(char[][] board, int row , int col , char ch)
    {
        for(int i=0;i<9;i++)
        {
            if(board[i][col]==ch)
                return false;
            if(board[row][i]==ch)
                return false;
            if(board[3*(row/3) + i/3][3*(col/3)+ i%3]==ch)
                return false;
        }
        return true;
    }
}
