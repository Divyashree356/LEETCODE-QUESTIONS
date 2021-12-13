            #EASY

//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//Input: head = [1,1,2,3,3]
Output: [1,2,3]

//Input: head = [1,1,2]
Output: [1,2]
 

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
    ListNode* deleteDuplicates(ListNode* head) {
        if(head==NULL)
        {
            return NULL;
        }
        if(head->next==NULL)
        {
          return head; 
        }
        ListNode* deleteNode;
        ListNode* temp=head;
        while(temp)
        {   
            while(temp->next &&temp->val == temp->next->val) //check next of temp null or not and then check value.
            {
                deleteNode= temp->next;
                temp->next=deleteNode->next;
                delete(deleteNode);
            }
            temp=temp->next;
        }
        return head;
    }
};
