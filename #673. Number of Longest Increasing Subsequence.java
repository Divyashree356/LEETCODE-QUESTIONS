class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        int n = nums.length;
        int[] length=new int[nums.length];
        int[] count= new int[n];
        
        Arrays.fill(length , 1);
        Arrays.fill(count , 1);
        
        int maxlen=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    if(length[j]+1>length[i])
                    {
                        length[i]= length[j]+1;
                        count[i]= count[j];
                    }
                    else if(length[j]+1 == length[i])
                        count[i]+=count[j];
                }
            }
                    maxlen= Math.max(maxlen, length[i]);
        } 
        
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(maxlen == length[i])
                ans+=count[i];
        }
        return ans;
    }
}
