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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        HashMap<Integer , Integer> hm= new HashMap<>();
        
        for(int i=0;i<inorder.length;i++)
             hm.put(inorder[i], i);
        
TreeNode root= construct(0 , preorder.length-1 , 0 , inorder.length-1 ,preorder , hm);
        return root;
    }
    
    private TreeNode construct(int plo , int phi , int ilo , int ihi,int[]p , HashMap<Integer , Integer> hm)
    {
        if(plo>phi || ilo>ihi)
             return null;
        
        
        TreeNode temp= new TreeNode();
        
        temp.val=p[plo];
        
        int idx= hm.get(p[plo]);
        int noOFNode= idx-ilo;
        
        temp.left=construct(plo+1, plo+noOFNode,ilo, idx-1, p , hm );
        temp.right= construct(plo+noOFNode+1 , phi , idx+1, ihi , p ,hm);
        
        return temp;
        
    } 
        
}
