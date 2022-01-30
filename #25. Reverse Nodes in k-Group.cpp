Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
   

    ListNode* reverseKGroup(ListNode* head, int k) {
        int num=0;
        
        ListNode* prev=NULL;
        ListNode* current=head;
        ListNode* nextNode;
        ListNode* t1=NULL , *t2=head , *newHead;
        
        while(current!=NULL){
            num++;
            current=current->next;
             
        }
        current=head;
        while(num>=k)
        {        
            int count=0;
        while(current!=NULL && count<k ){
            
            nextNode=current->next;
            current->next=prev;
            prev=current;
            current=nextNode;
            count++;
        }
         if(!newHead){
             newHead=prev;
         }
        if(t1)t1->next=prev;
            
            t2->next=current;
            t1=t2;
            t2=current;
            prev=NULL;
            num-=k;
        }
        return newHead;
    }
};
