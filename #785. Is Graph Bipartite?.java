class Solution {
    public class pair{
        int vtx;
        int color;
        
        pair(int vtx , int color)
        {
            this.vtx=vtx;
            this.color=color;
        }
    }
    
    // 0->blue
    // 1->red
    // -1->unvisited
    
    public boolean isBipartite(int[][] graph) {
        
        int[] vis= new int[graph.length];
        Arrays.fill(vis , -1);
        
        for(int v=0;v<graph.length;v++)
        {
            if(vis[v]==-1)
            {
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(v, 0));
        
        while(!q.isEmpty())
        {
            int size= q.size();
            
            while(size-->0)
            {
            pair rem= q.poll();
            if(vis[rem.vtx]!= -1)
            {
                if(vis[rem.vtx]==rem.color)
                     continue;
                else
                    return false;
            }
            
            vis[rem.vtx]= rem.color;
            int src= rem.vtx;
            for(int nbr:graph[src])
            {
                if(vis[nbr]==-1)
                {
                    q.add(new pair(nbr, 1-rem.color));
                }
            }
        }
    }
}
}
                
        return true;
    }
}
