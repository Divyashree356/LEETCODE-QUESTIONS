Example 1:


Input: head = [1,2,3,4]
Output: [2,1,4,3]
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [1]
Output: [1]
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
   
    
    ListNode* swapPairs(ListNode* head) {
        if(head==NULL ||head->next==NULL) 
            return head;
    ListNode *p1 ;
    ListNode *p2;
    ListNode *p3 ;
        p1 = head;
        p2= head->next;
        p3=p2->next;
        
        p1->next=p3;  
        p2->next=p1;
       if(p3!=NULL){
        p1->next=swapPairs(p3);
       }
        return p2;
        
    }
    
};
