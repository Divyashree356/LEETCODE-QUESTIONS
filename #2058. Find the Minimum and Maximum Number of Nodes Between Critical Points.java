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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int  first = Integer.MAX_VALUE , minimumIdx= Integer.MAX_VALUE;
        int end= 0;
        int i=0;
        ListNode prevNode = head;
       while(head.next!=null)
       {
           if(head.val > prevNode.val && head.val >head.next.val ||
             head.val<prevNode.val && head.val <head.next.val)
           {
               if(end!=0)
               {
                   minimumIdx = Math.min(minimumIdx , i-end);
               }
               first= Math.min(first , i);
               end= i;
           }
           prevNode= head;
           head= head.next;
           i++;
       }
    if(minimumIdx== Integer.MAX_VALUE)
        return new int[] {-1 , -1};
    else
        return new int[] {minimumIdx , end-first};
    }
}
