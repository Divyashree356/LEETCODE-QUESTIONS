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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return construct(0 , inorder.length-1, 0 , postorder.length-1, inorder, postorder);
    }
    
    private TreeNode construct(int ilo , int ihi , int polo ,int pohi , int[]i , int[]post)
    {
        if(ilo>ihi || polo>pohi)
            return null;
        
        TreeNode base= new TreeNode();
        
        base.val= post[pohi];
        
        int idx= ilo;
        while(idx<=ihi)
        {
            if(i[idx]==post[pohi])
                break;
            
            idx++;
        }
        
        int noOfN= ihi-idx;
        
        base.left= construct(ilo , idx-1 , polo , pohi-noOfN-1, i ,post);
        base.right= construct(idx+1 , ihi , pohi-noOfN, pohi-1 ,i , post);
        
        return base;
        
        
        
        
        
    }
}
