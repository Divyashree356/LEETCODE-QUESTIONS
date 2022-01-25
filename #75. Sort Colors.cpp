  #MEDIUM

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n=nums.size();
        for(int i=0;i<n-1;i++)
        {
            int minI=i;
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]<nums[minI])
                    minI=j;
            }
            swap(nums[i] , nums[minI]);
        }
    }
};
