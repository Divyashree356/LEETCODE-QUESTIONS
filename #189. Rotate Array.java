Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


class Solution {
    public void reverse(int[] nums , int s , int e)
    {
        while(s<=e)
        {
            int t= nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        
        k= k%n;
        
        if(k<0)
         k+=n;
        
        reverse(nums , 0 ,n-k-1);
        reverse(nums , n-k , n-1);
        reverse(nums , 0 , n-1);
    
    }
}
