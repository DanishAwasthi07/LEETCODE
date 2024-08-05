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
    bool isPalindrome(ListNode* head) {
        int flag=0;
        ListNode*slow=head;
        ListNode*fast=head;
        while(fast&&fast->next){
            slow=slow->next;
            fast=(fast->next)->next;
        }
        ListNode*curr=slow;
        ListNode*prev=NULL;
        ListNode*nxt=NULL;
        while(curr){
            nxt=curr->next;
            curr->next=prev;
            prev=curr;
            curr=nxt;
        }
        ListNode*i=head;
        ListNode*j=prev;
        while(j){
            if(i->val != j->val){
                 flag=1;
                 break;
            }
            else{
                i=i->next;
                j=j->next;
            }
        }
       if(flag==1) return false;
       return true;
    }
};