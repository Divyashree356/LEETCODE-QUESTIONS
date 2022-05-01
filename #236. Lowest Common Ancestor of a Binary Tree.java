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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        List<TreeNode>  pathP=getPath(root, p.val);
        List<TreeNode>  pathQ=getPath(root, q.val);
        
        int i= pathP.size()-1;
        int j= pathQ.size()-1;
        TreeNode lca=null;
        
        while(i>=0 && j>=0)
        {
            if(pathP.get(i).val != pathQ.get(j).val)
                break;
            
            lca=pathP.get(i);
            i--;
            j--;
        }
        return lca;
            
        
    }
    
    private List<TreeNode> getPath(TreeNode node, int data )
    {
        if(node== null)
             return new ArrayList<TreeNode>();
        if(node.val == data)
        {
            List<TreeNode> base = new ArrayList<>();
            base.add(node);
            return base;
        }
        
        List<TreeNode> leftans= getPath(node.left , data);
        if(leftans.size()>0)
        {
            leftans.add(node);
            return leftans;
        }
        
         List<TreeNode> rightans= getPath(node.right, data);
        if(rightans.size()>0)
        {
            rightans.add(node);
            return rightans;
        }
        return new ArrayList<>();
    }
}
