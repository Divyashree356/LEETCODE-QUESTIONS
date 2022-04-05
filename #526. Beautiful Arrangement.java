class Solution {
    int arrangements=0;
    
    public int countArrangement(int n) {
        
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        
        findArrangements(n , 1 , new int[n+1]);
        return arrangements;
            
    }
    private void  findArrangements(int n, int index , int[] used)
    {
        if(index>n)
        {
            arrangements++;
            return;
        }
    
        for(int i=1;i<=n;i++)
        {
            if(used[i]==0 && (index%i==0 || i%index==0))
            {
                used[i]=1;
                findArrangements(n , index+1, used);
                used[i]=0;
            }
        }
    }
    
}
