class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i=0;i<expression.length();i++)
        {
            char c= expression.charAt(i);
            
            if(c=='-' || c=='+' || c=='*')
            {
                String split1 = expression.substring(0 ,i);
                String split2 = expression.substring(i+1);
                
                List<Integer> split1Ans= diffWaysToCompute(split1);
                List<Integer> split2Ans= diffWaysToCompute(split2);
                
                for(int x: split1Ans)
                {
                    for(int y: split2Ans)
                    {
                        if(c=='+')
                         result.add(x+y);
                        else if(c=='*')
                         result.add(x*y);
                        else if(c=='-')
                         result.add(x-y);
                    }
                }
            }
        }
        if(result.size()==0)
            result.add(Integer.valueOf(expression));
                     
        return result;
    }
}
