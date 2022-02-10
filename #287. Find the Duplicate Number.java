Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3

class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
                return nums[i];
        }
        return -1;
    }
}
