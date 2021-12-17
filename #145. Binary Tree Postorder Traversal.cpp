   #EASY
//Example 1:

Input: root = [1,null,2,3]
Output: [3,2,1]

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
    void traversal(TreeNode* root , vector<int>& postorder)
    {
        if(!root)
        {
            return;
        }
            // postorder.push_back(root->val);
            traversal(root->left , postorder);
            traversal(root->right , postorder);
         postorder.push_back(root->val);
        
    }
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> postorder;
        traversal(root, postorder);
        return postorder;
    }
};
