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
    public int rob(TreeNode root) {
          
        if(root==null)
            return 0;
        
        int[] result= houseRobbery(root);
        return Math.max(result[0] , result[1]);
    }
    
    private int[] houseRobbery(TreeNode root)
    {
        if(root==null)
            return new int[2];
        
        int[] left= houseRobbery(root.left);  //only two values we will get 
        int[] right= houseRobbery(root.right);
        
        int[] myAns= new int[2];
        
        myAns[0]= left[1]+right[1]+ root.val;  //if we take the current root
        myAns[1]= Math.max(left[0] , left[1]) + Math.max(right[0], right[1]); //if we do not take the current root
        
        return myAns;
    }
}


//TLE
// class Solution {
//     public int rob(TreeNode root) {
        
//         if(root==null)
//             return 0;
        
//         return Math.max(includeRoot(root) , excludeRoot(root));
//         }
//     private int includeRoot(TreeNode root)
//     {
//         if(root==null)
//             return 0;
//         return excludeRoot(root.left) + excludeRoot(root.right)+ root.val;
//     }
//     private int excludeRoot(TreeNode root)
//     {
//         if(root==null)
//              return 0;
//         return rob(root.left)+ rob(root.right);
//     }
    
// }
