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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || k==0 )
            return head;
        
        ListNode slow= head;
        ListNode fast= head;
        ListNode firstVal= head;
        ListNode secondVal = head;
        
        while(k>1)
        {
            fast=fast.next;
            k--;
        }
        
        firstVal=fast;
        while(fast.next!=null)
        {
            slow= slow.next;
            fast= fast.next;
        }
        
        secondVal =slow;
        
        int temp =firstVal.val;
        firstVal.val=secondVal.val;
        secondVal.val =temp;
        
        return head;
        }
    
}
