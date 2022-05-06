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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
    if(root==null)
        return new ArrayList<>();
        
    List<List<Integer>> ans= new ArrayList<>();
    List<Integer> currAns = new ArrayList<>();
    Queue<TreeNode> q= new LinkedList<>();
        
    q.add(root);
    // q.add(null);
        
        while(q.size()>0)
        {
            
            int size= q.size();
            
            for(int i=0;i<size;i++)
            {
             TreeNode curr= q.remove();
                currAns.add(curr.val);
                
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
            }
           ans.add(new ArrayList<>(currAns));
               currAns= new ArrayList<>();

        }
        return ans;
        
    }
}
