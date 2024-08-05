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
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        if(head==NULL||head->next==NULL||abs(left-right)==0) return head;
        ListNode*temp=head;
        ListNode*temp1=NULL;
        ListNode*temp2=NULL;
        int count=1;
        while(temp){
            if(count==left-1 && left>1){
                temp1=temp;
            }
            if(count==right+1){
                temp2=temp;
            }
            count++;
            temp=temp->next;
        }
        ListNode*curr;
        ListNode*prev=temp2;
        ListNode*nxt=NULL;
        if(left==1){
            curr=head;
        }
        else{
            curr=temp1->next;
        }
        while(curr!=NULL&&curr!=temp2){
             nxt=curr->next;
             curr->next=prev;
             prev=curr;
             curr=nxt;
        }
        if(temp1){
            temp1->next=prev;
        }
        else{
            head=prev;
        }
        return head;
    }
};