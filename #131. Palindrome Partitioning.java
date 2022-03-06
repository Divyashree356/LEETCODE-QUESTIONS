class Solution {
    public List<List<String>> partition(String s) 
    {
        List<List<String>> result = new ArrayList<>();
        List<String> subPalindrome = new ArrayList<>();
        subStringPal(0 , s, result  ,subPalindrome);
        return result;
    }
   public void subStringPal(int idx , String str ,List<List<String>> result , List<String> subPalindrome)
   {
       if(idx==str.length())
       {
           result.add(new ArrayList<>(subPalindrome));
           return;
       }
       
       for(int i=idx ;i<str.length();i++)
       {
        if(isPalindorme(str , idx , i))
        {
            subPalindrome.add(str.substring(idx ,i+1));
            subStringPal(i+1 , str , result ,subPalindrome );
            subPalindrome.remove(subPalindrome.size()-1);
        }
       }
   }
    
public boolean isPalindorme(String s , int start , int end)
{
    while(start<=end)
    {
    if(s.charAt(start++)!=s.charAt(end--))
    {
        return false;
    }
}
    return true;
}
}
