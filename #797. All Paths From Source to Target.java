class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        getPaths(graph , result , 0 ,path );
        return result;
    }
    
    private void getPaths(int[][] graph ,List<List<Integer>> result , int nodeIdx , List<Integer> path )
    {
        if(nodeIdx== graph.length-1)
        {
            result.add(new ArrayList<>(path));
            return;
        }
        
        for(int next : graph[nodeIdx])
        {
            path.add(next);
            getPaths(graph , result , next , path);
            path.remove(path.size()-1);
        }
    }
}
