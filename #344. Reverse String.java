class Solution {
    
    public void swap( char[]s ,int i , int j)
    {
        char temp= s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    public void reverse(char[] s,int left ,int right)
    {
        if(left>=right)
            return;
        
        swap(s ,left++, right--);
        reverse(s , left , right);
    }
    public void reverseString(char[] s) {
       
        if(s.length==0)
            return;
        
       reverse(s ,0  , s.length-1);
    }
}
