class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> result= new ArrayList<>();
        boolean[] included = new boolean[nums.length];
        
        permutations(result , new ArrayList<>() ,nums, included );
        return result;
    }
    
    private void permutations(List<List<Integer>> result, List<Integer> curr ,int[] num,  boolean[] included)
    {
        if(curr.size() == num.length)
        {
            result.add(new ArrayList<Integer>(curr));
            return;
        }
        
        for(int i=0;i<included.length;i++)
        {
        if(!included[i])
           {  
             if( i>0 &&  num[i]==num[i-1] && included[i-1])
                return ;
           
            
          included[i]= true;
          curr.add(num[i]);
          permutations(result , curr ,num  , included);
          curr.remove(curr.size()-1);
          included[i]=false;
            
        }
        }
    }
}
