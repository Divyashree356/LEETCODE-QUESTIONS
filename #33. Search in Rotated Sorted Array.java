class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int mid;
        while(s<=e)
        {
            
           mid=(s+e)/2;
            
            if(target==nums[mid])
                return mid;
            
          
            if(nums[s]<=nums[mid])
            {
                if(target>=nums[s] && target<=nums[mid])
                {
                    e=mid-1;
                }
                else
                    s=mid+1;
                
            }
            else
            {
             if(target>=nums[mid] && target<=nums[e])
             {
                 s=mid+1;
             }
                else
                 e=mid-1;
            }
            }
        return -1;
        }
    }
