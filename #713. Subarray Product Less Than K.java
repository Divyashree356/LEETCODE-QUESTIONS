class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int prod=1;
        int s=0;
        int e=0;
        int ans=0;
        
        while(e<nums.length)
        {
            prod*=nums[e];
            while(s<nums.length && prod>=k)
            {
               prod/=nums[s];
               s++;
            }
            if(prod <k)
                ans+= e-s+1;
            
            e++;
        }
        return ans;
    }
}
