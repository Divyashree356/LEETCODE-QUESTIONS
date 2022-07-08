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
    public int findBottomLeftValue(TreeNode root) {
        
        int ans=root.val;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        
        while(q.size()>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode rem= q.remove();
                if(i==0)
                     ans=rem.val;
                
                if(rem.left!=null)
                    q.add(rem.left);
                
                if(rem.right!=null)
                    q.add(rem.right);
            }
        }
        return ans;        
    }
}
