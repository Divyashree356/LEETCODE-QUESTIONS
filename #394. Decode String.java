class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> numS = new Stack<>();
        Stack<String>  stringS= new Stack<>();
        String result="";
        
        int i=0;
        while(i<s.length())
        {
            char c= s.charAt(i);
         if(Character.isDigit(c))
         {
             int num=0;
             while(Character.isDigit(s.charAt(i)))
             {
               num = num*10 +  (int)s.charAt(i)-'0';
                i++;
              }
            numS.push(num);
        }
          else if(c=='[')
         {
              stringS.push(result);  
              result="";
              i++;
         }
          else if(c==']')
          {
              StringBuilder sb= new StringBuilder(stringS.pop());
              int count= numS.pop();
              for(int j=0;j<count;j++)
              {
                  sb.append(result);
              }
              result= sb.toString();
              i++;
          }
            else
            {
                result+=c;
                i++;
            }
        }
        return result;
    }
}
