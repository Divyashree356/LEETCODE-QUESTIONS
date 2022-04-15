class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        
        
        int sum=0;
        for(int n : nums)
           sum+=n;
        
        if(k<=0 || sum%k != 0)
            return false;
        
        int[] visited= new int[nums.length];
        return partition(visited , nums , sum/k , 0 , 0 , k);
        
    }
    
    private boolean partition(int[] visited ,int[] nums , int target , int currSum , int idx , int k)
    {
        if(k==1)
            return true;
        
        if(currSum == target )
            return partition(visited , nums , target , 0 , 0  , k-1);
        
        if(currSum>target)
            return false;
        
        for(int i=idx;i<nums.length;i++)
        {
            if(visited[i]==0)
            {
                visited[i]=1;
        if(partition(visited , nums , target , currSum+nums[i] , i+1 , k))
            return true;
                visited[i]=0;
            }
        }
        return false;
        
    }
}

// class Solution {
//     public boolean canPartitionKSubsets(int[] nums, int k) {
        
//         int sum=0;
//         for(int n : nums)
//            sum+=n;
        
//         if(k<=0 || sum%k != 0)
//             return false;
        
//         int[] visited= new int[nums.length];
//         return partition(visited , nums , sum/k , 0 , 0 , 0 , k);
        
//     }
    
//     private boolean partition(int[] visited ,int[] nums , int target , int currSum , int currVal , int idx , int k)
//     {
//         if(k==1)
//             return true;
        
//         if(currSum == target && currVal>0)
//             return partition(visited , nums , target , 0 , 0 , 0 , k-1);
        
//         if(currSum>target)
//             return false;
        
//         for(int i=idx;i<nums.length;i++)
//         {
//             if(visited[i]==0)
//             {
//                 visited[i]=1;
//         if(partition(visited , nums , target , currSum+nums[i] , currVal+1 , i+1 , k))
//             return true;
//                 visited[i]=0;
//             }
//         }
//         return false;
//     }
    
// }
