//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

//Each row must contain the digits 1-9 without repetition.
//Each column must contain the digits 1-9 without repetition.
//Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.//

//Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]

//Output: true

class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        unordered_set<int> rowSet[9];
        unordered_set<int> colSet[9];
        unordered_set<int> boxSet[9];
        
        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
             char val =board[r][c];
             if(val=='.') continue;
                
             int pos= (r/3)*3 +c/3;
             if(rowSet[r].count(val) || colSet[c].count(val) || boxSet[pos].count(val) )
                 return false;
                
            rowSet[r].insert(val);
            colSet[c].insert(val);
            boxSet[pos].insert(val);
            
            }
        }
        return true;
    }
};
