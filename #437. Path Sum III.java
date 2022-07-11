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
    int count;
    public int pathSum(TreeNode root, int targetSum) {
        
        nodeAsRoot(root , targetSum);
        return count;
        
    }
    
    private void nodeAsRoot(TreeNode root , int targetSum)
    {
        if(root==null)
             return;
        
        getSumForEachNode(root , targetSum , 0);
        
        nodeAsRoot(root.left , targetSum);
        nodeAsRoot(root.right , targetSum);

}
    
    private void getSumForEachNode(TreeNode root , int target, int currSum)
    {
        if(root==null)
             return;
        
        if(currSum+root.val ==target)
             count++;
        
        getSumForEachNode(root.left , target , currSum+root.val);
        getSumForEachNode(root.right , target , currSum+root.val);

        
    }
}



------------------------------------------------------------------------------------------------------------------------------------
    
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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root==null)
             return 0;
        
        HashMap<Integer, Integer> hm= new HashMap<>();
        hm.put(0 ,1);
        
        helper(root , root.val ,hm , targetSum);
        return count;
    }
    
    private void helper(TreeNode root , int psum ,HashMap<Integer, Integer> map, int target )
    {
        
        if(map.containsKey(psum-target)==true)
        {
            count+=map.get(psum-target);
        }
        if(map.containsKey(psum))
        {
            map.put(psum , map.get(psum)+1);
        }
        else
        {
            map.put(psum ,1);
        }
        
        if(root.left!=null)
             helper(root.left , psum+root.left.val , map , target);
        
        if(root.right!=null)
             helper(root.right , psum+root.right.val , map , target);
        
        
        if(map.get(psum)==1)
        {
            map.remove(psum);
        }
        else
        {
            map.put(psum , map.get(psum)-1);

        }
        
        
    }
}
