class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];
        int[] result = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            bucket[nums[i]]++;;
        }
        
        for(int j=1;j<=100;j++)
        {
            bucket[j] += bucket[j-1];
        }
        
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]==0)
                result[k]=0;
            else
             result[k]= bucket[nums[k]-1];
        }
        return result;
    }
}
