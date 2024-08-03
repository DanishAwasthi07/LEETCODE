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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(!head && !head->next) return head;
        ListNode* dummy = new ListNode(0,head);
        ListNode*slow=dummy;
        ListNode*fast=dummy;
        for(int i=0;i<n;i++){
            fast=fast->next;
        }
        while(fast->next){
            slow=slow->next;
            fast=fast->next;
        }
        ListNode*temp=slow->next;
        slow->next=temp->next;
        return dummy->next;
    }
};