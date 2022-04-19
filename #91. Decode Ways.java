class Solution {
    public int numDecodings(String s) {
        
        if(s==null || s.length()==0)
            return 0;
        
        int[] dp= new int[s.length()+1];
        dp[0]=1;  //a string of length 0 has 1 way to represent
        dp[1]= s.charAt(0)!='0'?1:0;  //1 way decode 1 length of string if not 0
        
        for(int i=2;i<=s.length();i++)
        {
            int first= Integer.valueOf(s.substring(i-1 , i));
            int second=Integer.valueOf(s.substring(i-2 , i));
            
            if(first>0 && first<10)
               dp[i]+=dp[i-1];
            if(second>=10 && second<=26)
                dp[i]+=dp[i-2];
        }
        return dp[s.length()];
    }
}