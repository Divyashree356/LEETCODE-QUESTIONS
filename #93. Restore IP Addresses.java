class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        List<String> result = new ArrayList<>();
        generateIPaddress(s, 0 ,0 ,"" ,result);
        return result;
    }
    
    public void generateIPaddress(String s  ,int i, int part , String currAns , List<String>result)
    {
        
        if(i==s.length() || part==4)
        {
            if(part==4 && i==s.length())
            {
              result.add(currAns.substring(0 ,currAns.length()-1));  
            }
            return;
        }
        
         generateIPaddress(s, i+1 , part+1 , currAns+(s.charAt(i))+"." , result);
        if(i+2 <=s.length() && isIPvalid(s.substring(i , i+2)))
         generateIPaddress(s , i+2 , part+1 , currAns+(s.substring(i , i+2))+"." , result);
        if(i+3<= s.length() && isIPvalid(s.substring(i , i+3)))
          generateIPaddress(s ,i+3 , part+1 , currAns+(s.substring(i , i+3))+"." , result);  
    }
    
    public boolean isIPvalid(String s)
    {
        if(s.charAt(0) == '0')
            return false;
        
        int val= Integer.parseInt(s);
            return val<=255;
    }
}
