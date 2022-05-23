            #EASY

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted.


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,3] and [3,1] are both a height-balanced BSTs.

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* makeBST(vector<int>& nums  ,int start , int end)
    {
          int mid= (start +end )/2;
        if(start>end)
            return NULL;
        
        TreeNode* root=new TreeNode(nums[mid]);
        root->left=(makeBST(nums, start , mid-1));
        root->right=(makeBST(nums, mid+1 , end));
        
        return root;
            
    }
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        if(nums.size() ==0)
            return NULL;
        if(nums.size()==1)
            return new TreeNode(nums[0]);
        
        TreeNode* root= makeBST( nums ,0, nums.size()-1);
        return root;
    }
};



//JAVA
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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length==0)
            return null;
        return createBST(nums , 0 , nums.length-1);
    }
    
    public TreeNode createBST(int[] nums , int i , int j)
    {
        if(i>j)
        {
         return null;   
        }
        
        int mid= (i+j)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left= createBST(nums , i , mid-1);
        node.right= createBST(nums ,mid+1 , j);
        
        return node;
    }
    
}
