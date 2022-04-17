class Solution {
    public int rob(int[] nums) {

//Tabulation-->>
//         int sum1=0;
//         int sum2=0;
//         int temp=0;
        
//         for(int num: nums)
//         {
//             temp= sum1;
//             sum1= Math.max(sum1 ,sum2+num);
//             sum2=temp;
//         }
//         return sum1;
        
       
//Memoization-->>
        int[] dp= new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            dp[i+1]=Math.max(dp[i] ,dp[i-1]+nums[i]);
        }
        return dp[nums.length];
    }
}
