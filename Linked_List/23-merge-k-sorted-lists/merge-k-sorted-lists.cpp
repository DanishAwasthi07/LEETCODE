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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2){
         if(!list1) return list2;
         if(!list2) return list1;
         if(!list1 && !list2) return NULL;
         ListNode* c1=list1;
         ListNode* c2=list2;
         if(c1->val>=c2->val){
               c2->next=mergeTwoLists(c1,c2->next);
               return c2;
            }
        else{
               c1->next=mergeTwoLists(c1->next,c2);
               return c1;
            }
}
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        int sz=lists.size();
        if(sz==0) return NULL;
        if(sz==1) return lists[0];
        while(sz>1){
        for(int i=0;i<sz/2;i++){
             lists[i]=mergeTwoLists(lists[i], lists[sz - i - 1]);
        }
        sz=(sz+1)/2;
        }
        return lists[0];
    }

};