Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int ans=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
                if(count>nums.length/2)
                {
                     ans=nums[i];
                    break;
                }
            }
            else{
                count=1;
               }
        }
        return ans;
    }
}
