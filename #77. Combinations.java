class Solution {
    public void combinations(List<List<Integer>> result , List<Integer> currResult , int start, int n , int k )
    {
        if(k==0)
        {
            result.add(new ArrayList<>(currResult));
        }
        
        for(int i= start; i<=n;i++)
        {
            currResult.add(i);
            combinations(result , currResult , i+1 ,n  ,k-1);
            currResult.remove(currResult.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        combinations(result , new ArrayList<>() , 1 , n , k);
        return result;
    }
}
