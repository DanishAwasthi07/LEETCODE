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
        ListNode* count_temp=head;
        ListNode*dummy = new ListNode(0,head);
        ListNode*prev= dummy;
        ListNode*curr=head;
        ListNode*nxt=NULL;
        int count=0,count1=0;
        while(count_temp!=NULL){
            count++;
            count_temp=count_temp->next;
        }
        while(count>=k){
            for(int i=1;i<k;i++){
                nxt=curr->next;
                curr->next=(nxt->next);
                nxt->next=prev->next;
                prev->next=nxt;
            }
            prev=curr;
            curr=prev->next;
            count=count-k;
        }
        return  dummy->next ;
        }
};