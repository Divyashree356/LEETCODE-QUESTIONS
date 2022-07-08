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
    public List<List<Integer>> levelOrderBottom(TreeNode node) {
        
        List<List<Integer>>ans= new ArrayList<>();
        
        if(node==null)
             return ans;
        
        Queue<TreeNode> q= new LinkedList<>();
        Stack<List<Integer>> st= new Stack<>();
        
        List<Integer>res= new ArrayList<>();
        
        q.add(node);
        q.add(null);
        while(q.size()>0)
        {
            TreeNode rem= q.remove();
            if(rem!=null)
            {
                res.add(rem.val);
                
                if(rem.left!=null)
                 q.add(rem.left);
                if(rem.right!=null)
                 q.add(rem.right);
            }
            else
            {
                st.push(res);
                
                 res= new ArrayList<>();
                if(q.size()>0)
                  q.add(null);
            }
        }
        
        while(st.size()!=0)
        {
            List<Integer> result= st.pop();
              ans.add(result);
        }
        return ans;
    }
}
