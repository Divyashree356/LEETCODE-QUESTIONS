class Solution {
    
public void combinations(int[] candidates ,  int target ,List<List<Integer>> result , int idx , List<Integer> comb)
{
    if(target>0)
    {
    for(int i=idx ;i<candidates.length && candidates[i]<=target ;i++)
    {
        comb.add(candidates[i]);
        combinations(candidates , target-candidates[i] , result , i, comb);
        comb.remove(comb.size()-1);
    }
    }
    else if(target==0)
    {
        result.add(new ArrayList<Integer>(comb));
    }
    
}
        
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(candidates);
        combinations(candidates , target , result , 0 , new ArrayList<>());
        
        return result;
    }
}
