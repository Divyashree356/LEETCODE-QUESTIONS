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
    int count;
    public int pathSum(TreeNode root, int targetSum) {
        
        nodeAsRoot(root , targetSum);
        return count;
        
    }
    
    private void nodeAsRoot(TreeNode root , int targetSum)
    {
        if(root==null)
             return;
        
        getSumForEachNode(root , targetSum , 0);
        
        nodeAsRoot(root.left , targetSum);
        nodeAsRoot(root.right , targetSum);

}
    
    private void getSumForEachNode(TreeNode root , int target, int currSum)
    {
        if(root==null)
             return;
        
        if(currSum+root.val ==target)
             count++;
        
        getSumForEachNode(root.left , target , currSum+root.val);
        getSumForEachNode(root.right , target , currSum+root.val);

        
    }
}
