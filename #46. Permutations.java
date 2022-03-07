class Solution {
public void permutations(int[] nums ,List<List<Integer>> result,List<Integer> subPer , boolean[] usedEle)
    {
        if(nums.length == subPer.size())
        {
            result.add(new ArrayList<>(subPer));
            return;
        }
    
    for(int i=0;i<nums.length;i++)
    {
        if(usedEle[i])
        continue;
        
        subPer.add(nums[i]);
        usedEle[i]=true;
        permutations(nums , result , subPer , usedEle);
        usedEle[i]=false;
        subPer.remove(subPer.size()-1);
        
    }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result= new ArrayList<>();
        if(nums.length==0)
            return result;
        
        permutations(nums , result , new ArrayList<>() , new boolean[nums.length]);
        return result;
    }
}
