class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        
        if(s.length()== 0)
            return result;
        
        HashSet<String> visited= new HashSet<>();
        Queue<String> q= new LinkedList<>();
        
        q.add(s);
        visited.add(s);
        
        boolean stringFound= false;
        
        while(!q.isEmpty())
        {
            s= q.poll();
            
            if(isValid(s))
            {
                result.add(s);
                stringFound=true;
                // continue;
            }
            
            if(stringFound)
                continue;
            
            for(int i=0;i<s.length();i++)
            {
                
                if(s.charAt(i)!='(' && s.charAt(i)!=')')
                    continue;
                
                String temp = s.substring(0 , i) + s.substring(i+1);
                
                if(!visited.contains(temp))
                {
                    visited.add(temp);
                    q.add(temp);
                }
                
            }
        }
        return result;
    }
    
    private boolean isValid(String s)
    {
       int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                count++;
            if(s.charAt(i)==')' && count--==0)
             return false;
        }
        return count==0?true:false;
    }
}
