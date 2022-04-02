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
    public List<String> binaryTreePaths(TreeNode root) {
        
         List<String> result = new ArrayList<>();
         rootToLeaf(root , result ,"" );
        return result;
    }
    private void rootToLeaf(TreeNode root , List<String> result, String ans)
    {
        if(root==null)
         return;
        
        if(root.left==null && root.right==null)
            result.add(ans+ root.val);
        if(root.left!=null)
            rootToLeaf(root.left , result , ans+root.val+"->");
        if(root.right!=null)
            rootToLeaf(root.right, result , ans+root.val+"->");
        
        
    }
}
