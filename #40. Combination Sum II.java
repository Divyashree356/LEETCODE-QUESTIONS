class Solution {
    
public void combinationsII(int[] candidates ,  int target ,List<List<Integer>> result , int idx , List<Integer> comb)
{
    if(target>0)
    {
    for(int i=idx ; i< candidates.length  && target>= candidates[i];i++)
    {
        if(i>idx &&  candidates[i]==candidates[i-1])
            continue;
        else
        {comb.add(candidates[i]);
        combinationsII(candidates , target-candidates[i] , result , i+1, comb);
        comb.remove(comb.size()-1);
        }
    }
    }
    else if(target==0)
    {
        result.add(new ArrayList<Integer>(comb));
    }
    
}
        
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(candidates);
        combinationsII(candidates , target , result , 0 , new ArrayList<>());
        
        return result;
    }
}
