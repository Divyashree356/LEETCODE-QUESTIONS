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
    int maxSum= Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        maxPathNTN(root);
        return maxSum;
    }
    
    private int maxPathNTN(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int left= maxPathNTN(root.left);
        int right= maxPathNTN(root.right);
        
        int left_= Math.max(0 , left);
        int right_= Math.max(0 , right);
        
        int rootToNode= left_+right_+root.val;
        
        if(rootToNode>maxSum)
            maxSum=rootToNode;
        
        return Math.max(left_ , right_)+root.val;
        
            
    }
}
