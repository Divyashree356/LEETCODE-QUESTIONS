      #MEDIUM


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]


class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& arr) {
       
        int n=arr.size();
        int m=arr[0].size();
         vector<int> sp; 
        int minr=0;
        int maxr=n-1;
        int minc=0;
        int maxc=m-1;
        
        int total=m*n;
        int count =0;
        
        while(count<total)
        {
        for(int i=minc;i<=maxc && count<total ;i++)
        {
         sp.push_back(arr[minr][i]);
            count++;
        }minr++;
        for(int i=minr;i<=maxr&& count<total ;i++)
        {
            sp.push_back(arr[i][maxc]);
            count++;
        }maxc--;
         for(int i=maxc;i>=minc&& count<total ;i--)
        {
            sp.push_back(arr[maxr][i]);
            count++;
        }maxr--;
        
      for(int i=maxr;i>=minr&& count<total ;i--)
        {
            sp.push_back(arr[i][minc]);
            count++;
        }minc++;
    }
        return sp;
    }
};
