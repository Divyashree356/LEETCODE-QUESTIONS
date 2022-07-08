/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    class  pair implements Comparable<pair>{
        TreeNode node;
        int ver;
        int hor;
        pair(TreeNode node , int ver, int hor)
        {
        this.node= node;
        this.ver= ver;
        this.hor= hor;
        }
        
        public int compareTo(pair other)
        {
            if(this.ver==other.ver)
            {
                return this.node.val-other.node.val; 
            }
            else
            {
                return this.ver-other.ver;
            }
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        Queue<pair> q= new LinkedList<>();
        HashMap<Integer ,PriorityQueue<pair>> hm= new HashMap<>();
        
        int lmh=0;
        int rmh=0;
        
        q.add(new pair(root , 1, 0));
        
        while(q.size()>0)
        {
            pair rem= q.remove();
        
            if(lmh>rem.hor)
            {
              lmh=rem.hor;   
            }
            if(rmh<rem.hor)
            {
                rmh=rem.hor;
            }
            
            if(hm.containsKey(rem.hor)==false)
            {
                hm.put(rem.hor, new PriorityQueue<>());
                hm.get(rem.hor).add(rem);
            }
            else
            {
                hm.get(rem.hor).add(rem);
            }
            
            if(rem.node.left!=null)
                 q.add(new pair(rem.node.left, rem.ver+1,rem.hor-1));
            
            if(rem.node.right!=null)
                q.add(new pair(rem.node.right , rem.ver+1, rem.hor+1));
            
        }
        
        List<List<Integer>> ans= new ArrayList<>();
        
        for(int i=lmh;i<=rmh;i++)
        {
            List<Integer> sub= new ArrayList<>();
            PriorityQueue<pair> pq= hm.get(i);
            
            while(pq.size()>0)
            {
                pair rem= pq.remove();
                sub.add(rem.node.val);
            }
           ans.add(sub); 
            
        } 
            
        return ans;
        
    }
}
