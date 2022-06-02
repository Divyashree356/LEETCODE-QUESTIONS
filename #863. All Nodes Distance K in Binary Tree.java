/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void getParent(HashMap<TreeNode,TreeNode> parentChild , TreeNode root)
    {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        
        while(q.size()!=0)
        {
            TreeNode curr= q.poll();
            if(curr.left!=null)
            {
                parentChild.put(curr.left , curr);
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                parentChild.put(curr.right , curr);
                q.add(curr.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        HashMap<TreeNode , TreeNode> parentChild= new HashMap<>();
        getParent(parentChild , root);
        
        HashMap<TreeNode , Boolean> vis= new HashMap<>();
        vis.put(target , true);
        int depth=0;
        
        Queue<TreeNode> q= new LinkedList<>();
        q.add(target);
        
        while(!q.isEmpty())
        {
            int size= q.size();
            if(depth==k)
                 break;
            
            depth++;
            for(int i=0;i<size;i++)
            {
                TreeNode curr= q.poll();
                if(curr.left!=null && vis.get(curr.left)==null)
                {
                    vis.put(curr.left , true);
                    q.add(curr.left);
                }
                 if(curr.right!=null && vis.get(curr.right)==null)
                {
                    vis.put(curr.right , true);
                    q.add(curr.right);
                }
        if(parentChild.get(curr) != null && vis.get(parentChild.get(curr))==null)
                {
                    vis.put(parentChild.get(curr), true);
                    q.add(parentChild.get(curr));
                }
            }
            
        }
        
        List<Integer> result= new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode curr= q.poll();
            result.add(curr.val);
        }
        return result;
    }
}
