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

#SOLUTION-1
class Solution {
  
    private int getHeight(TreeNode root)
    {
        if(root==null)
            return -1;
        
        int lh= getHeight(root.left);
        int rh= getHeight(root.right);
        
        return Math.max(lh , rh)+1;
        
     }
    public int diameterOfBinaryTree(TreeNode root) {
     
        if(root==null)
             return 0;
        
        int ld= diameterOfBinaryTree(root.left);
        int rd= diameterOfBinaryTree(root.right);
        
        int lh= getHeight(root.left);
        int rh= getHeight(root.right);
        
        int mD = lh+rh+2;
        
        return Math.max(mD, Math.max(rd, ld));
        
    }
  }

#SOLUTION-2
class Solution {
    public class pair
    {
        int h;
        int d;
        
        pair(){}
        pair(int h , int d)
        {
            this.h=h;
            this.d=d;
        }
    }
    
    private pair diameter(TreeNode node)
    {
        if(node==null)
            return new pair(-1,0);
        
        pair la=diameter(node.left);
        pair ra=diameter(node.right);
        
         pair my= new pair();
        
         my.h= Math.max(la.h,ra.h)+1;
         int acrossR= la.h + ra.h +2;
        
        my.d= Math.max(acrossR, Math.max(la.d, ra.d));
        return my;
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        pair ans= diameter(root);
        return ans.d;
    }
}

#SOLUTION-3
class Solution {
    
    public int[] diameter(TreeNode node)
    {
        if(node==null)
             return new int[]{-1,0};
        
        int[] la= diameter(node.left);
        int[] ra=diameter(node.right);
        
        int[] my= new int[2];
        my[0] = Math.max(la[0] ,ra[0])+1;
        int acrossR= la[0]+ra[0]+2;
        
        my[1]= Math.max(acrossR , Math.max(la[1], ra[1]));
        return my;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans=  diameter(root);
        return ans[1];
    }
}
