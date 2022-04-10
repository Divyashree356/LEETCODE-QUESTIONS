class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> record = new Stack<>();
        for(String s: ops)
        {
            if(s.equals("C"))
            {
                record.pop();
            }
            else if(s.equals("D"))
            {
                record.push(record.peek()*2);
            }
            else if(s.equals("+"))
            {
                int val1 = record.pop();
                int val2= record.peek();
                record.push(val1);
                record.push(val1+val2);
            }
            else
            {
                int i = Integer.parseInt(s);
                record.push(i);
            }
        }
        
        int sum=0;
        while(!record.isEmpty())
        {  
            System.out.println(record.peek());
            sum+= record.pop();
        }
        return sum;
    }
}
