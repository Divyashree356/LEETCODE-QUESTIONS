              #MEDIUM

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        int n =intervals.size();
        
        if(n==1)
            return intervals;
        
        sort(intervals.begin(), intervals.end());
        vector<vector<int>> merged;
        int i=0;
        for(i=0;i<n-1;i++)
        {
            if(intervals[i][1] < intervals[i+1][0])
            {
                merged.push_back(intervals[i]);
             }
            else
            {
              intervals[i+1][0]=intervals[i][0];
                if(intervals[i+1][1] <intervals[i][1])
                intervals[i+1][1]=intervals[i][1];
            }
        }
        merged.push_back(intervals[i]);
        return merged;
    }
};


//using stack JAVA
class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b)->{
           return a[0]-b[0]; 
        });
        Stack<int []> st= new Stack<>();
        st.push(intervals[0]);
        
        for(int i=1;i<intervals.length;i++)
        {
         int[] t= st.pop();
         int e= Math.max(t[1] , intervals[i][1]);
             if(t[1]>=intervals[i][0])
            {
            st.push(new int[]{t[0], e});
         }
            else
         {
                st.push(t);
               st.push(intervals[i]);
         }
              
      }
      int[][] ans= new int[st.size()][2];
        
        for(int i=ans.length-1;i>=0;i--)
        {
            int[] temp= st.pop();
            ans[i][0]=temp[0];
            ans[i][1]=temp[1];
        }    
        return ans;
        
    }
}
