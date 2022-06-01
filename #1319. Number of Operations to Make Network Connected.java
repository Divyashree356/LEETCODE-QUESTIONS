class Solution {
    public int makeConnected(int n, int[][] connections) {
        
        if(connections.length <n-1)
             return -1;
        
        List<Integer>[] graph= new ArrayList[n];
        int components=0;
        
        for(int i=0;i<n;i++)
        graph[i]= new ArrayList<>();
        
        for(int[]c : connections)
        {
            graph[c[0]].add(c[1]);
            graph[c[1]].add(c[0]);
        }
        
        boolean[] vis= new boolean[n];
        for(int v=0;v<n;v++)
             components+= getComponent(graph , vis , v);
        
        return components-1;
    }
    
    public int getComponent(List<Integer>[] graph , boolean[] vis, int src)
    {
        if(vis[src]==true)
             return 0;
        
        vis[src]=true;
        for(int v:graph[src])
            getComponent(graph , vis , v);
        
        return 1;
    }
}
