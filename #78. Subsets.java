class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        subsetsAns(nums , result , 0 ,new ArrayList<>());
        return result;
    }
    
    private void subsetsAns(int[] nums ,List<List<Integer>> result , int start , List<Integer> curr )
    {
        result.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++)
        {
           curr.add(nums[i]);
           subsetsAns(nums , result , i+1 , curr);
           curr.remove(curr.size()-1);
        }
    }
}
