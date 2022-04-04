class Solution {
    public List<String> addOperators(String num, int target) {
        
        List<String> result= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        findStrings(num, target , sb , result, 0 ,0 ,0);
        return result;
    }
    
    public void findStrings(String num, int target ,StringBuilder sb , List<String> result,int idx , long val ,long mulVal )
    {
        if(idx== num.length())
        {
            if(target== val)
              result.add(sb.toString());
            return;
        }
    
        for(int i=idx; i<num.length();i++)
        {
            if(i!=idx && num.charAt(idx)== '0')
                break;
            
            long curr= Long.parseLong(num.substring(idx ,i+1)); 
            
            int len= sb.length();
            if(idx==0)
            {
                findStrings(num , target , sb.append(curr) ,result , i+1 , curr , curr );
                sb.setLength(len);
            }
            else
            {
                findStrings(num , target , sb.append("+").append(curr) , result , i+1 , val +curr , curr);
                sb.setLength(len);
            findStrings(num , target , sb.append("-").append(curr) , result , i+1 , val-curr ,-curr);
                sb.setLength(len);
                findStrings(num , target , sb.append("*").append(curr) , result , i+1 ,  val-mulVal + mulVal*curr , curr*mulVal);
                sb.setLength(len);
                
                
                
            }
        }
        
    }
}
