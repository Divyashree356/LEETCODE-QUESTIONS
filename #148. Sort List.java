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
    public ListNode sortList(ListNode head) {
        if(head== null || head.next==null)
            return head;
    
        ListNode midNode = getMidNode(head);
        ListNode left = sortList(head);
        ListNode right= sortList(midNode);
        return mergeList(left , right);
    }
    public ListNode mergeList(ListNode list1 , ListNode list2)
    {
        ListNode dummyList= new ListNode(0);
        ListNode temp= dummyList;
        
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                temp.next= list1;
                list1=list1.next;
                temp=temp.next;
            }
            else
            {
                temp.next= list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
        
        temp.next= list1!=null ? list1 : list2;
        return dummyList.next;
    }
    public ListNode getMidNode(ListNode head)
    {
        ListNode slow= head;
        ListNode fast= head;
        ListNode prev= head;
        
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev.next!=null)
        {
            prev.next=null;
        }
        return slow;
    }
        
}
