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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        
        ArrayList<TreeNode> list1= getPath(root , startValue);
        ArrayList<TreeNode> list2= getPath(root , destValue);
        
//     for(int k=0;k<list1.size();k++)
//         System.out.print(list1.get(k).val);
        
//         System.out.println();
        
  // for(int k=0;k<list2.size();k++)
  //       System.out.println(list2.get(k).val);

        
        int i= list1.size()-1;
        int j= list2.size()-1;
        
        while(i>=0 && j>=0)
        {
            if(list1.get(i) == list2.get(j))
            {
                i--;
                j--;
            }
            else
               break;
        }
        i++;
        j++;
        
        StringBuilder sb= new StringBuilder();
        for(int ii=0;ii<i;ii++)
        {
            sb.append("U");
        }
        
        for(int jj=j;jj>0;jj--)
        {
            if(list2.get(jj-1) == list2.get(jj).left)
                 sb.append("L");
            else
                 sb.append("R");
        }
        
        return sb.toString();

    }
    
    private ArrayList<TreeNode> getPath(TreeNode root, int val)
    {
        if(root==null)
            return new ArrayList<>();
        
        if(root.val==val)
        {
            ArrayList<TreeNode> ret= new ArrayList<>();
            ret.add(root);
            return ret;
        }
        else
        {
            ArrayList<TreeNode> left= getPath(root.left , val);
            if(left.size()>0)
            {
                left.add(root);
                return left;

            }
    
              ArrayList<TreeNode> right= getPath(root.right , val);
            if(right.size()>0)
            {
                right.add(root);
               return right;

            }
        else{
            return new ArrayList<>();
        }
        
    }
}
}
