Example 1:


Input: head = [2,1,5]
Output: [5,5,0]
Example 2:


Input: head = [2,7,4,3,5]
Output: [7,0,5,5,0]

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
    public int[] nextLargerNodes(ListNode head) {
    
        int arr[] = new int[listLength(head)];
        int i=0;
        while(head!=null)
        {
            arr[i++]=findHighVal(head, head.val);
            head=head.next;
        }
        return arr;
    }
    public int listLength(ListNode head)
    {  int l=0;
        while(head!=null)
        {  
            head=head.next;
            l++;
        }
     return l;
    }
    public int  findHighVal(ListNode node , int val )
    {
        int nodeVal=0;
        while(node!=null)
        {
         if(node.val>val)
         {
             nodeVal= node.val;
             break;
         }
            node=node.next;
        }
        return nodeVal;
    }
}#
