class Solution {
    public boolean isPowerOfThree(int n) {
       
        //n=27
        if(n==0)
            return false;
        
        while(n%3==0)  //n=9 //0 //loop break
        {
            n/=3;  //n=3 //n=1
        }
        
        if(n==1)  // 1 return 
            return true;
        else
            return false;
    }
}
