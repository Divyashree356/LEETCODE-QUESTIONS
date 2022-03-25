class Solution {
    public int calculate(String s) {
        Stack<Integer> brackets = new Stack<>();
        int answer= 0;
        int digit=0;
        int sign=1;
        
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(Character.isDigit(c))
            {
                digit= 10*digit + (int)(c-'0');
            }
            else if(c=='+')
            {
                answer+= digit*sign;
                digit=0;
                sign=1;
            }
            else if(c=='-')
            {
                answer+= digit*sign;
                digit=0;
                sign=-1;
            }
            else if(c=='(')
            {
              brackets.push(answer);
              brackets.push(sign);
                
              answer=0;
              sign=1;
            }
           else if(c==')')
           {
               answer+= digit*sign;
               digit=0;
               
               answer*= brackets.pop();
               answer+= brackets.pop();
           }
        }
        if(digit!=0)
         answer+=digit*sign;
        
        return answer;
    }
}
