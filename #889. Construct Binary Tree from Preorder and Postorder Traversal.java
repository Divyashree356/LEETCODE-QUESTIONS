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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        
        
        HashMap<Integer , Integer> hm= new HashMap<>();
        for(int i=0;i<postorder.length;i++)
        {
            hm.put(postorder[i], i);
        }
        
        return construct(preorder ,hm,  0 , preorder.length-1 , 0 , postorder.length-1);
    }
    
    
    private TreeNode construct(int[] pre,  HashMap<Integer , Integer> hm , int prelo , int prehi , int postlo , int posthi)
    {
        if(prelo>prehi || postlo > posthi)
            return null;
        
        TreeNode node = new TreeNode();
        node.val=pre[prelo];
        
        if(prelo+1<= prehi)
        {
            int idx = hm.get(pre[prelo+1]);
            int lhs= idx-postlo+1;
            
            node.left= construct(pre,hm , prelo+1 , prelo+lhs,postlo , postlo+idx );
            node.right= construct(pre,hm , prelo+lhs+1 , prehi ,idx+1 , posthi-1 );

        }
        return node;
        
    }
        
}
