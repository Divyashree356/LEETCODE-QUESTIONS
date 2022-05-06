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
    private int getHeight(TreeNode root)
    {
        if(root==null)
            return -1;
        
        int lh= getHeight(root.left);
        int rh= getHeight(root.right);
        
        return Math.max(lh , rh)+1;
        
     }
    public int diameterOfBinaryTree(TreeNode root) {
     
        if(root==null)
             return 0;
        
        int ld= diameterOfBinaryTree(root.left);
        int rd= diameterOfBinaryTree(root.right);
        
        int lh= getHeight(root.left);
        int rh= getHeight(root.right);
        
        int mD = lh+rh+2;
        
        return Math.max(mD, Math.max(rd, ld));
        
    }
}
