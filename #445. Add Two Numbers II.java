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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1== null || l2==null)
            return null;
        
        Stack<Integer> list1= new Stack<>();
        Stack<Integer> list2= new Stack<>();
        
        while(l1!=null)
        {
            list1.push(l1.val);
            l1= l1.next;
        }
         while(l2!=null)
        {
            list2.push(l2.val);
            l2= l2.next;
        }
        
        int sum=0;
        ListNode list =new ListNode(1);
        while(!list1.empty() || !list2.empty())
        {
            if(!list1.empty())
              sum+=list1.pop();
            
            if(!list2.empty())
              sum+=list2.pop();
            
            list.val= sum%10;
            ListNode temp= new ListNode(sum/10);
            temp.next= list;
            list= temp;
            sum/=10;
            
        }
     return list.val==0? list.next:list;
        }
}
