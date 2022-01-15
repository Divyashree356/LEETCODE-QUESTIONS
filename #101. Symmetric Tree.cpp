    #EASY      

Input: root = [1,2,2,3,4,4,3]
Output: true

Input: root = [1,2,2,null,3,null,3]
Output: false
  
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
    bool isTree(TreeNode* root1 , TreeNode* root2)
    {
        if(root1==NULL && root2==NULL)
            return true;
        
        if(root1==NULL || root2==NULL)
            return false;
        
        if(root1->val!=root2->val)
            return false;
        
        return isTree(root1->left,root2->right) && isTree(root1->right, root2->left);
        }
    bool isSymmetric(TreeNode* root) {
        if(!root)
            return true;
        
        return isTree(root->left, root->right) && isTree(root->right, root->left);
    }
};
