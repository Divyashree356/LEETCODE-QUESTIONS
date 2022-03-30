class Solution {
    
    static public boolean[][] dp;
    public boolean exist(char[][] board, String word) {
        
      dp=  new boolean[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(word.charAt(0)== board[i][j] && wordExist(board , word , i , j , 0))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean wordExist(char[][] board , String word  ,int i ,int j  ,int wordIdx)
    {
        if(word.length()== wordIdx)
            return true;
        
        if(i<0 || i >= board.length || j<0 || j >= board[0].length || dp[i][j]==true || word.charAt(wordIdx)!= board[i][j])
        {return false;}
        
        dp[i][j]=true;
        if(wordExist(board , word , i-1 , j , wordIdx+1)||
           wordExist(board , word , i+1 , j , wordIdx+1)||
           wordExist(board , word , i , j-1 , wordIdx+1)||
           wordExist(board , word , i , j+1 , wordIdx+1)
                    )
        {return true;}
        
       dp[i][j]=false;
        return false;
    }
}
