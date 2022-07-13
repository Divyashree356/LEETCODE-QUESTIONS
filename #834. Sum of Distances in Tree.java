class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            
            graph[u].add(v);
            graph[v].add(u);
            
        }
        
        int[] nodes= new int[n];
        int[] res= new int[n];
        
        helper1(graph , 0 , -1 ,nodes , res);
        helper2(graph , 0 , -1 ,nodes , res);

        return res;        
    }
    
    private void helper1( ArrayList<Integer>[] graph , int src , int par,int[] nodes , int[] res)
    {
        for(int nbr:graph[src])
        {
            if(nbr!=par)
            {
                helper1(graph  , nbr , src, nodes , res);
                nodes[src]+= nodes[nbr];
                res[src]+= nodes[nbr]+res[nbr];
            }
        }
        nodes[src]++;
    }
    
        private void helper2( ArrayList<Integer>[] graph , int src , int par,int[] nodes , int[] res)
    {
        for(int nbr:graph[src])
        {
            if(nbr!=par)
            {
                res[nbr] =res[src]+ (nodes.length-nodes[nbr]) - (nodes[nbr]);
                helper2(graph  , nbr , src, nodes , res);

            }
        }
    }
}
