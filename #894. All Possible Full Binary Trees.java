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
    public List<TreeNode> allPossibleFBT(int n) {
        return totalTrees(n);
    }
    
    public List<TreeNode> totalTrees(int n)
    {
        if(n==1)
        {
            List<TreeNode> base = new ArrayList<>();
            base.add(new TreeNode(0));
            return base;
        }
        List<TreeNode> answer= new ArrayList<>();
     for(int i=1;i<n;i+=2)
     {
         List<TreeNode> left= totalTrees(i);
         List<TreeNode> right = totalTrees(n-i-1);
         
         for(TreeNode l: left)
         {
             for(TreeNode r:right)
             {
                 TreeNode root = new TreeNode(0);
                 root.left=l;
                 root.right=r;
                 answer.add(root);
             }
         }
     }
         return answer;
     }
    }
