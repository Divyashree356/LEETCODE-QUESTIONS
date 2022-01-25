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
