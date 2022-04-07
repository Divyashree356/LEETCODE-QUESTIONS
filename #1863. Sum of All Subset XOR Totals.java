class Solution {
    public int subsetXORSum(int[] nums) {
        
        return getSubsetXor(nums , 0 , 0); //current xor sum=0
    }
    
    public int getSubsetXor(int[] nums , int idx , int currSumXor)
    {
        if(idx==nums.length)
            return currSumXor;
        
        int include= getSubsetXor(nums , idx+1 , currSumXor^nums[idx]);
        int exclude= getSubsetXor(nums , idx+1 , currSumXor);
        
        return include+ exclude;
    }
}
