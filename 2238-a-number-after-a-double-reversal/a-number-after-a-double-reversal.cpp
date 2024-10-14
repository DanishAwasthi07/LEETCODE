class Solution {
public:
    bool isSameAfterReversals(int num) {
        int temp=num,rem,rem1,temp1;
        long rev=0,rev1=0;
        while(num!=0){
        rem=num%10;
        rev=(10*rev)+rem;
        num=num/10;
        }
        temp1=rev;
        while(rev!=0)
        {
            rem1=rev%10;
            rev1=(10*rev1)+rem1;
            rev=rev/10;
        }
        return rev1==temp;
        }
};