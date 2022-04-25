class Solution {
    public int scoreOfParentheses(String s) {
        
        Stack<Integer> st= new Stack<>();
        st.push(0);
        
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            
            if(c=='(')
                 st.push(0);
            else
            {
                int temp= st.pop();
                int val=0;
                if(temp>0)
                {
                    val= temp*2;
                  
                }
                else 
                    val=1;
                
               int t=st.pop();
                st.push(t+val);
                }
            
            }
       
        return st.peek();
    }
}
