Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
  

class Solution {
    int count;
    public void merge(int[] arr , int low , int mid , int high)
    {
        int i= low;
        int j=mid+1;
        while(i<=mid && j<=high)
        {
            if((long)arr[i]>(long)2*arr[j])
            {  count+=mid+1-i;
             j++;
            }
            
            else
                i++;
        }
        Arrays.sort(arr , low  , high+1);
    }
    public void mergesort(int [] arr , int low , int high)
    {
        if(low==high)
            return ;
        
        int mid=(low+high)/2;
        mergesort(arr , low , mid);
        mergesort(arr , mid+1 , high);
        merge(arr , low , mid , high);
    
    }
    
    
    public int reversePairs(int[] nums) {
        if(nums.length==0)
             return 0;
        
        count=0;
        mergesort(nums,0 , nums.length-1);
        
        return count;
        
    }
}
