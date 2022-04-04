class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        if(n==0)
            return 1;
        
        int result= 10;
        int unique= 9;
        int digits= 9;
        while(n-->1 && digits>0 )
        {
            unique= unique*digits;
            result+= unique;
            digits--;
        }
        
        return result;
    }
}
