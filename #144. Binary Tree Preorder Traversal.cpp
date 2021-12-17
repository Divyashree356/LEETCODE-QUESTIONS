//Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

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
    void traversal(TreeNode* root , vector<int>& preorder)
    {
        if(!root)
        {
            return;
        }
            preorder.push_back(root->val);
            traversal(root->left , preorder);
            traversal(root->right , preorder);
        
    }
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> preorder;
        traversal(root, preorder);
        return preorder;
    }
};
