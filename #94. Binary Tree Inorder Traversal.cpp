    #EASY
//Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]

//Example 2:

Input: root = []
Output: []

//Example 3:

Input: root = [1]
Output: [1]



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
    void traversal(TreeNode* root , vector<int>& inorder)
    {
        if(!root)
        {
            return;
        }
    
            traversal(root->left , inorder);
            inorder.push_back(root->val);
            traversal(root->right , inorder);
        
    }
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> inorder;
        traversal(root, inorder);
        return inorder;
    }
};
