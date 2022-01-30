Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]

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
    ListNode* reverseList(ListNode* head) {
        if(head== NULL)
         return NULL;
        ListNode *temp , *prev , *nextNode;
        nextNode=head;
        temp=head;
        prev=NULL;
        while(nextNode !=NULL)
        {
            nextNode=temp->next;
            temp->next = prev;
            prev=temp;
            temp=nextNode;
        }
        return prev;
    }
};
