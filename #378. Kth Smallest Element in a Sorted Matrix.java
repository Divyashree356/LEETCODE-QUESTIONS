              #MEDIUM

Example 1:

Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
Example 2:

Input: matrix = [[-5]], k = 1
Output: -5

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int low=matrix[0][0] , high=matrix[n-1][n-1];
        
        while(low<high)
        {
            int mid=low+(high-low)/2;
            int count=getRank(matrix,mid);
            
            if(count<k)
                low=mid+1;
            
            else
                high=mid;
        }
        return low;
        
    }
    public int getRank(int[][] matrix, int mid)
    {
      int r=0;
      int c=matrix.length-1;
        int idx=0;
        
      while(r<matrix.length && c>=0)
      {
          
         if(matrix[r][c]>mid )
              c--;
          else
          { idx+=c+1;
            r++;
           }
      }
        return idx;
    }
}
