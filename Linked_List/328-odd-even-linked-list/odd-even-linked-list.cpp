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
    ListNode* oddEvenList(ListNode* head) {
        if(!head ) return head;
        if(!head->next) return head;
        ListNode*temp=(head->next)->next;
        ListNode*dummy1= new ListNode(0,head);
        ListNode*prev1=head;
        ListNode*dummy2= new ListNode(0);
        ListNode*prev2=head->next;
        dummy2->next=prev2;
        int count=3;
        while(temp!=NULL){
            if(count%2==0){
                prev2->next=temp;
                prev2=prev2->next;
            }
            else if(count%2!=0){
                prev1->next=temp;
                prev1=prev1->next;
            }
            count++;
            temp=temp->next;
        }
        prev2->next=NULL;
        prev1->next=dummy2->next;
        return dummy1->next;
    }
};