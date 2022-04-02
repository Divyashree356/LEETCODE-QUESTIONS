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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> resultPath = new ArrayList<>();
        getPath(root, targetSum , new ArrayList<>() , resultPath);
        return resultPath;
    }
    
    private void getPath(TreeNode root, int target , List<Integer> currPath ,List<List<Integer>> result)
    {
        if(root==null)
            return ;
        
         currPath.add(root.val);
        
        if(root.left==null && root.right==null)
        {
            if(root.val ==target)
                result.add(new ArrayList<Integer>(currPath));
            return;
        }
        
        if(root.left!=null)
        {
            getPath(root.left ,target-root.val, currPath , result);
            currPath.remove(currPath.size()-1);
        }
        
        if(root.right!=null)
        {
            getPath(root.right ,target-root.val, currPath , result);
            currPath.remove(currPath.size()-1);
        }
        
    }
}
