/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode left;
    public void reordering(ListNode right , int count , int length)
    {
        if(right==null)
            return;
        
        reordering(right.next , count+1 , length);
        if(count > length/2)
        {
            ListNode temp = left.next;
            left.next= right;
            right.next= temp;
            left= temp;
        }
        else if(count == length/2)
        {
            right.next= null;
        }
    }
    public void reorderList(ListNode head) {
        if(head== null || head.next==null)
            return;
        
        int len=getLength(head);
        left= head;
        reordering(left , 0 , len);
    }
    
    public int getLength(ListNode head)
    {
        int l=0;
        while(head!=null)
        {
            l++;
            head=head.next;
        }
        return l;
    }
}
