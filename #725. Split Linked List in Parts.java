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
    public int getLength(ListNode head)
    {
        int l=0;
        while(head!=null)
        {
            l++;
            head= head.next;
        }
        return l;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] partsOfList = new ListNode[k];
        
        if(head== null)
            return partsOfList;
        
        int length = getLength(head);
        
        int minNodesinParts= length/k;
        int remainingNodes = length%k;
        
        int i=0;
        ListNode current=head;
        ListNode prev = null;
        while(i<k && current!= null)
        {
            partsOfList[i] = current;
            for(int j=0;j<minNodesinParts+ (remainingNodes>0 ? 1:0);j++)
            {
                prev=current;
                current= current.next;
                
            }
            prev.next=null;
            i++;
            remainingNodes--;
        }
        return partsOfList;
    }
}
