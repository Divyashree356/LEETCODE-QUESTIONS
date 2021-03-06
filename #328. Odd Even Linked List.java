Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]

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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null || head.next==null || head.next.next==null)
            return head;
        
        ListNode odd , even , evenStart;
        odd=head;
        even=head.next;
        evenStart=head.next;
        while(odd.next!=null && even.next!=null)
        {
            odd.next=even.next;
            even.next=odd.next.next;
            even=even.next;
            odd=odd.next;
        }
        odd.next=evenStart;
        
        return head;
    }
}
