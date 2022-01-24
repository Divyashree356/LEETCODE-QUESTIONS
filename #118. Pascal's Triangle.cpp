                #EASY

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]


class Solution {
public:
    vector<vector<int>> generate(int numRows) {
     vector<vector<int>>  pascal(numRows);
        
        for(int i=0;i<numRows;i++)
        {
            pascal[i].resize(i+1);
            pascal[i][0]= pascal[i][i]=1;
            
            for(int j=1;j<i;j++)
            {
                pascal[i][j]=pascal[i-1][j-1] +pascal[i-1][j];
            }
        }
        return pascal;
    }
};
