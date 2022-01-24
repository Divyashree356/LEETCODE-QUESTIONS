                            #EASY

Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.

 Example 2:
Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.

Example 3:
Input: root = [], targetSum = 0
Output: false
Explanation: Since the tree is empty, there are no root-to-leaf paths.
  
  

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
    bool checkPathSum(TreeNode* root, int targetSum , int sum)
    {
        sum= sum+ root->val;
        if(sum==targetSum && (!root->left && !root->right))
            return true;
        
        bool r1 , r2;
        
        if(root->left)
            r1=checkPathSum(root->left , targetSum , sum);  

        if(root->right)
            r2=checkPathSum(root->right , targetSum , sum);
        
        return r1 || r2;

        
    }
    bool hasPathSum(TreeNode* root, int targetSum) {
        if(root==NULL)
            return false;
        
        return checkPathSum(root , targetSum , 0);
            
    }
};
