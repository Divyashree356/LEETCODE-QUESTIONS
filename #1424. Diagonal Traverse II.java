class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        
        List<Stack<Integer>> list= new ArrayList<>();
        int count=0;
        for(int i=0; i<nums.size();i++)
        {
            List<Integer> newList= nums.get(i);
            
            for(int j=0; j <newList.size();j++)
            {
              int idx= i+j;
             if(list.size() < idx+1)
             {
                 list.add(new Stack());
             }
            
            list.get(idx).push(newList.get(j));
                count++;
            }
        }
        
        int[] result= new int[count];
        int index=0;
        for(Stack<Integer> stack :list)
        {
            while(!stack.isEmpty())
            {
             result[index]=stack.pop();
                index++;
            }
        }
        return result;
    }
}
