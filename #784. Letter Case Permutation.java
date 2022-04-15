class Solution {
    public List<String> letterCasePermutation(String s) {
        
        if(s.length()==0)
            return new ArrayList<>();
        
        List<String> result = new ArrayList<>();
        getPermutation(s.toCharArray() , 0 ,result );
        return result;
            
    }
    
    private void getPermutation(char[] s , int pos, List<String> result)
    {
    if(pos== s.length)
    {
        result.add(new String(s));
        return;
    }
        
    if(s[pos]>='0' && s[pos]<='9')
    {
        getPermutation(s , pos+1 , result);
        return;
    }
    
    s[pos]=Character.toLowerCase(s[pos]);
    getPermutation(s , pos+1 , result);
        
    s[pos]=Character.toUpperCase(s[pos]);
    getPermutation(s , pos+1 , result);
        
    }
}
