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
    int i=0;
    public TreeNode recoverFromPreorder(String traversal) {
        return getTree(traversal , 0);
    }
    
    private TreeNode getTree(String str , int depth)
    {
        int dash=0;
        int nodeVal=0;
        while(i+dash<str.length() && str.charAt(i+dash)=='-')
        {
            dash++;
        }
        
        if(dash!=depth)
            return null;
        
        while(i+dash+nodeVal<str.length() && str.charAt(i+dash+nodeVal)!='-')
        {
            nodeVal++;
        }
        
        int val= Integer.parseInt(str.substring(i+dash , i+dash+nodeVal));
        i+=dash+nodeVal;
        
        TreeNode node = new TreeNode(val);
        
        node.left= getTree(str , depth+1);
        node.right= getTree(str , depth+1);
        
        return node;
    }
}
