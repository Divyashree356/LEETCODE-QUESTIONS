/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        Node curr=root;
        
        while(curr!=null)
        {
            Node curr2= curr;
            while(curr2!=null)
            {
                if(curr2.left!=null)
                  curr2.left.next=curr2.right;
                
                if(curr2.right!=null && curr2.next!=null)
                {
                    curr2.right.next= curr2.next.left;
                }
                
                curr2=curr2.next;
            }
            curr=curr.left;
        }
        return root;
    }
}
