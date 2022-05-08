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
    int ans=0;
    private int getSum(TreeNode root)
    {
        if(root==null)
             return 0;
        
        int leftSum= getSum(root.left);
        int rightSum= getSum(root.right);
        
        ans+=Math.abs(leftSum-rightSum);
        return leftSum+rightSum+root.val;
    }
    public int findTilt(TreeNode root) {
        getSum(root);
        return ans;
    }
}
