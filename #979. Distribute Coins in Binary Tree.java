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
    int moves=0;
    
    public class pair{
        int nodes;
        int coins;
       
    }
    public int distributeCoins(TreeNode root) {
        
        helper(root);
        return moves;
    }
    
    public pair helper(TreeNode root)
    {
        if(root==null)
             return new pair();
        
        pair lp= helper(root.left);
        pair rp= helper(root.right);
        
        pair mp= new pair();
        mp.nodes= lp.nodes+ rp.nodes+1;
        mp.coins= lp.coins+ rp.coins+ root.val;
        
        moves+= Math.abs(mp.nodes-mp.coins);
        
        return mp;
    }
}
