class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0)
            return 0;
        
        if(nums.length<2)
            return nums[0];
        
        int[] takingFirst= new int[nums.length+1];
        int[] takingSecond= new int[nums.length+1];
        
        takingFirst[0]=0;
        takingSecond[0]=0;
        takingFirst[1]=nums[0]; //since we are taking first
        takingSecond[1]=0; //since we are not taking first we are taking in count from second 
        
        for(int i=1;i<nums.length;i++)
        {
            takingFirst[i+1]= Math.max(takingFirst[i] , takingFirst[i-1]+nums[i]);
            takingSecond[i+1]=Math.max(takingSecond[i], takingSecond[i-1]+nums[i]);
        }
        return Math.max(takingFirst[nums.length-1] , takingSecond[nums.length]);
        
    }
}
