class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        
        List<List<Integer>> result= new ArrayList<>();
        getSubsequences(nums , result , 0  , new ArrayList<>());
        return result;
        
    }
    
    private void getSubsequences(int[] nums ,List<List<Integer>> res , int idx , List<Integer> subset)
    {
        if(subset.size()>1)
            res.add(new ArrayList<>(subset));
        
        Set<Integer> used= new HashSet<>();
        for(int i= idx ;i<nums.length;i++)
        {
            if(used.contains(nums[i]))
                continue;
            
            if(subset.size()==0 || subset.get(subset.size()-1)<=nums[i])
            {
                used.add(nums[i]);
                subset.add(nums[i]);
                getSubsequences(nums , res ,i+1 , subset);
                subset.remove(subset.size()-1);
            }
        }
    }
}
