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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyList =  new ListNode(0 ,head);
        ListNode l = dummyList;
        
        for(int i=0;i<left-1;i++)
            l=l.next;
        
        ListNode start= l.next;
        ListNode end= start.next;
        
        for(int i=0;i<right-left;i++)
        {
            start.next=end.next;
            end.next= l.next;
            l.next=end;
            end=start.next;
        }
        return dummyList.next;
    }
}
