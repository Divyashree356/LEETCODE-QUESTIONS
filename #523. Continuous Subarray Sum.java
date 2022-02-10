Example 1:

Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
Example 2:

Input: nums = [23,2,6,4,7], k = 6
Output: true
Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
Example 3:

Input: nums = [23,2,6,4,7], k = 13
Output: false

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        // if(nums.length==1 && nums[0]!=k)
        //     return false;
        
        int ans=0;
        HashMap<Integer , Integer> map =new HashMap<>();
        
        map.put(0,-1);
        int sum=0;
        int rem=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            
            if(k!=0)
             rem=sum%k;
            
            if(rem<0)
                rem+=k;
            
            if(map.containsKey(rem))
            {
               if(i-map.get(rem)>=2) 
                   return true;
            }
            else
                map.put(rem , i);
        }
            return false;
    }
}
