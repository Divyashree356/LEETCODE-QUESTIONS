                          #MEDIUM

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

//concept of sliding window

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n =nums.length;
        int end=0;
        int sum=0;
        int start=0;
        int ans= Integer.MAX_VALUE; 
            
        while(end<n)
        {
            while(sum<target && end<n)
            {
                sum+=nums[end++];
            }
            while(sum>=target && start<n)
            {
                if(end-start<ans)
                {
                   ans=end-start;        
                }
            sum-=nums[start++];
            }
                
        }
        return (ans!=Integer.MAX_VALUE)?ans:0;
    }
}
