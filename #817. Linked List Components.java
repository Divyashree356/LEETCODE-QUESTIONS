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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> hm= new HashSet<>();
        
        for(int ele: nums)
            hm.add(ele);
        
        int result=0;
        while(head!=null)
        {
            if(hm.contains(head.val) && ( head.next==null || !hm.contains(head.next.val)))
                result++;
            
            head= head.next;
        }
        return result;
    }
}
