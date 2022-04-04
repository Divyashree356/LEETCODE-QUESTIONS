class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> result= new ArrayList<>();
        combinations(k , n , result , new ArrayList<>() ,1);
        return result;
    }
    
    public void combinations(int k , int n ,List<List<Integer>> result , List<Integer> comb , int start)
    {
        if(comb.size()==k && n==0)
        {
            result.add(new ArrayList<>(comb));
            return;
        }
        
        for(int i=start;i<=9;i++)
        {
            comb.add(i);
            combinations(k , n-i , result , comb , i+1 );
            comb.remove(comb.size()-1);
        }
    }

    }
