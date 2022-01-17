        #EASY
Input: root = [3,9,20,null,null,15,7]
Output: true


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

Input: root = []
Output: true
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
    int height(TreeNode* root)
    {
        if(root==NULL)
            return 0;
        
        return max(height(root->left) , height(root->right))+1;
        }
    bool isBalanced(TreeNode* root) {
        if(root==NULL)
            return true;
        
        if(isBalanced(root->left)==false)
            return false;
        if(isBalanced(root->right)==false)
            return false;
        int lh=height(root->left);
        int rh=height(root->right);
        
        if(abs(lh-rh)<=1)
            return true;
        else
            return false;
    }
};
