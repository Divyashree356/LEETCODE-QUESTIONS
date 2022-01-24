                  #MEDIUM

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int maxAns=nums[0];
        int mini= nums[0];
        int maxi=nums[0];
        
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i]<0)
                swap(mini , maxi);
            
             mini=min(mini * nums[i] , nums[i]);
             maxi=max(maxi*nums[i] , nums[i]);
            maxAns= max(maxi , maxAns);
        }
        return maxAns;
    }
};
