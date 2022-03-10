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
    public ListNode partition(ListNode head, int x) {
        
        ListNode frontList= new ListNode(0);
        ListNode backList = new ListNode(0);
        
        ListNode front =frontList , back =backList , curr=head;
        
        while(curr!=null)
        {
            if(curr.val<x)
            {
                front.next=curr;
                front=curr;
            }
            else
            {
                back.next=curr;
                back=curr;
            }
            curr=curr.next;
        }
        front.next= backList.next;
        back.next=null;
        return frontList.next;
    }
}
