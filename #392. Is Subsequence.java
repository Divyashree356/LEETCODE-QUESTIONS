class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i=0;
        int j=0;
        int check=0;
        
        while(s.length()>j && t.length()>i)
        {
            if(t.charAt(i)==s.charAt(j))
            {
                i++;
                j++;
                check++;
            }
            else
            {
                i++;
            }
        }
        return check==s.length()?true:false;
    }
}
