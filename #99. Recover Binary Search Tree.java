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
    public void recoverTree(TreeNode root) {
         
        TreeNode curr= root;
        TreeNode prev= null;
        TreeNode n1=null;
        TreeNode n2=null;
        while(curr!=null)
        {
            if(curr.left==null)
            {
              
                if(prev!=null && prev.val>curr.val)
                {
                    if(n1==null)
                    {
                        n1=prev;
                        n2=curr;
                    }
                    else
                        n2=curr;
                }
                    
                prev=curr;
                curr=curr.right;
            }
            else
            {
                //if not visites inP.right is null
                
                TreeNode inPred= curr.left;
                while(inPred.right!=null && inPred.right!= curr)
                {
                    inPred= inPred.right;
                }
                
                if(inPred.right==null)
                {
                    inPred.right=curr;
                    curr=curr.left;
                }
                else
                {
                    inPred.right=null;
                              
                if(prev!=null && prev.val>curr.val)
                {
                    if(n1==null)
                    {
                        n1=prev;
                        n2=curr;
                    }
                    else
                        n2=curr;
                }
                    
                prev=curr;
                  curr=curr.right;
                }
                
                //add link and goto left
                //if visited by checking inP.right not null
                //remove link and print
            
            }
            
        }
        int temp= n1.val;
        n1.val=n2.val;
        n2.val=temp;
        
    }
}
