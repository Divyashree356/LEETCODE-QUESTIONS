Example 1:


Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:


Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:



Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node iter =head;
        Node front=head;
        
        while(iter!= null)
        {
         front=iter.next;
        Node copy=new Node(iter.val);
            iter.next=copy;
            copy.next =front;
            
            iter =front;
        }
        iter=head;
        while(iter!=null)
        {
            if(iter.random!=null)
            {
                iter.next.random= iter.random.next;
            }
            iter=iter.next.next;
        }
        iter=head;
        Node psuedoNode=new Node(0);
        Node copy=psuedoNode;
        
        while(iter!=null)
        {
            front=iter.next.next;
          
            copy.next=iter.next;
            copy=copy.next;
            
            iter.next=front;
            iter=front;
         }
        return psuedoNode.next;
    }
    
}
