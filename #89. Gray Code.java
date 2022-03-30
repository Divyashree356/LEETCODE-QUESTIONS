class Solution {
    public List<Integer> grayCode(int n) {
       
    List<String> codeInString = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
        
        codeInString=toGrayCode(n);
        result =stringToInteger(codeInString);
        
        return result;
        }
    private int toDecimal(long n)
    {
        long ans=0;
        int pow=1;
        
        while(n!=0)
        {
            long rem= n%10;
            n/=10;
            
            ans+=rem*pow;
            pow=pow*2;
        }
        return (int)ans;
    }
    private List<Integer> stringToInteger(List<String> codeInString)
    {
        List<Integer> myAns= new ArrayList<>();
        int i=0;
        while(i<codeInString.size())
        {
            String str= codeInString.get(i);
            long number = Long.parseLong(str);
            int decimal = (int)toDecimal(number);
            myAns.add(decimal);
            i++;
        }
        return myAns;
    }
    private List<String> toGrayCode(int n)
    {
        if(n==1)
        {
         List<String> base = new ArrayList<>();
         base.add("0");
         base.add("1");
            return base;
        }
        
     List<String> recResult = toGrayCode(n-1);
     List<String> myResult  = new ArrayList<>();
     for(int i=0;i< recResult.size();i++)
     {
         String res= recResult.get(i);
         myResult.add("0"+res);
     }
      for(int i= recResult.size()-1;i>=0;i--)
     {
         String res= recResult.get(i);
         myResult.add("1"+res);
     } 
      return myResult;  
    }
}
