class Solution {
    public boolean makesquare(int[] matchsticks) {
      
        if(matchsticks.length==0 || matchsticks.length<4)
            return false;
        
        int sum=0;
        
        for(int nums: matchsticks)
            sum+=nums;
        
        if(sum%4!=0)
            return false;
        
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        return checkingSquare(matchsticks , new int[4] , 0 , sum/4);
        
    }
    
    private void reverse(int[] arr)
    {
        int l=0;
        int r=arr.length-1;
        
        while(l<=r)
        {
            int temp= arr[l];
            arr[l]=arr[r];
            arr[r]= temp;
            
            l++;
            r--;
        }
    }
    private boolean checkingSquare(int[] arr , int[] square , int idx , int side)
    {
        if(idx==arr.length)
        {
            if(square[0]==side && square[1]==side && square[2]==side)
                return true;
            
            return false;
        }
        
        for(int i=0;i<4;i++)
        {
            if(square[i]+arr[idx]>side)
                continue;
            
            square[i]+=arr[idx];
            if(checkingSquare(arr, square , idx+1 , side))
                return true;
            
            square[i]-=arr[idx];
            
        }
        return false;
    }
}
