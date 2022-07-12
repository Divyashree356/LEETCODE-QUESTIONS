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
    int count=0;
    final int camera=1;
    final int monitored=2;
    final int notMonitored=3;
    
    public int minCameraCover(TreeNode root) {
        
        if(root==null)
             return 0;
        
        int val=helper(root);
        if(val==notMonitored)
             count++;
        
        return count;
    }
    
    private int helper(TreeNode node)
    {
        if(node==null)
             return monitored;
        
        int left= helper(node.left);
        int right= helper(node.right);
        
        
        if(left==notMonitored || right==notMonitored)
        {
            count++;
            return camera;
        }
        
        else if(left==camera || right==camera)
             return monitored;
        else 
            return notMonitored;
            
    }
}
