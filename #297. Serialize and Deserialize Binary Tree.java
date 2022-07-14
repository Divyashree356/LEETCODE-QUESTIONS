/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        if(root==null)
             return "";
        
        StringBuilder sb= new StringBuilder();
        helper(root , sb);
        return sb.toString();
        
    }
    
    private void helper(TreeNode node, StringBuilder sb)
    {
        if(node==null)
        {
            sb.append(".");
            sb.append(" ");
            return;
        }
        
        sb.append(node.val);
        sb.append(" ");
        
        helper(node.left , sb);
        helper(node.right , sb);
        
    }

    class pair{
        TreeNode node;
        int state=0;
    }
    
    public TreeNode deserialize(String data) {
        
        int i=0;
        
        if(data.length()==0)
            return null;
        
        String[] dataArr= data.split(" ");
        
        Stack<pair> st= new Stack<>();
        pair root= new pair();
        root.node= new TreeNode();
        root.node.val= Integer.parseInt(dataArr[0]);
        
        st.push(root);
        
        while(st.size()>0)
        {
            pair rem= st.peek();
            if(rem.state==0)
            {
                 i++;
                 rem.state++;

              if(dataArr[i].equals(".")==false)
                {
                    
                TreeNode leftN= new TreeNode();
                leftN.val= Integer.parseInt(dataArr[i]);
                
                rem.node.left= leftN;
                
                pair leftP= new pair();
                leftP.node= leftN;
                  
                 st.push(leftP);
                }
                
            }
            else if(rem.state==1)
            {
                 i++;
                 rem.state++;

              if(dataArr[i].equals(".")==false)
                {
                    
                TreeNode  rightN= new TreeNode();
                rightN.val= Integer.parseInt(dataArr[i]);
                
                rem.node.right= rightN;
                
                pair rightP= new pair();
                rightP.node= rightN;
                  
                 st.push(rightP);
                }
                
            }
            else
            {
                st.pop();
            }
        }
        return root.node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
