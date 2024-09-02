class Solution {
public:
    bool isPerfectSquare(int num) {
        long s=1,e=num;
        int mid;
        while(s<=e){
            mid =s+(e-s)/2;
            if((long)mid*mid==num){
                return true;
            }
            else if((long)mid*mid>num){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
};
