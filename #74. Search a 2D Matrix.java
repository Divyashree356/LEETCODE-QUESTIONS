                  #MEDIUM
                  
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
  
  

class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n= arr[0].length;
        int m=arr.length;
        int j=n-1;
        int i=0;
        
        while( i<m && j>=0)
        {
        if(arr[i][j]<target)
        {
            i++;
        }
        else
        {
            if(arr[i][j]==target)
            { return true;}
            
            else
            { j--;}
        }
    }
        return false;
        
    }
}
