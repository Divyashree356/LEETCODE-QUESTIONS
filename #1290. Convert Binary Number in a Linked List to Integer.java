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
    public int getDecimalValue(ListNode head) {
     if(head==null)
         return 0;
    int integer=0;
        while(head!=null)
        {
            integer*=2;
            integer+=head.val;
            head= head.next;
         
         }
        return integer;
    }
}
