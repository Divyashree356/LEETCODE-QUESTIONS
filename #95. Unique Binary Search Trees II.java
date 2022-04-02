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
    public List<TreeNode> generateTrees(int n) {
         
        return uniqueTrees(1, n);
        
    }
       private List<TreeNode> uniqueTrees(int start , int end)
       {
           List<TreeNode> result = new ArrayList<>();
           if(start>end)
           {
               result.add(null);
               return result;
           }
           
           for(int i= start ;i<=end;i++)
           {
               List<TreeNode> left =uniqueTrees(start , i-1);
               List<TreeNode> right =uniqueTrees(i+1 ,end);
               
               for(TreeNode l :left)
               {
                   for(TreeNode r : right)
                   {
                       TreeNode root= new TreeNode(i);
                       root.left=l;
                       root.right=r;
                       result.add(root);
                   }
               }
               }
           return result;
       }
}
