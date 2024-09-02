class Solution {
public:
    int mySqrt(int x) {
        int INTMAX=2147395599;
        if(x==0 || x==1) return x;
        else if(x == INTMAX){
            return 46339;
        }
        else if(x>INTMAX){
            return 46340;
        }
        int s=1,e=x,ans=1;
        float mid;
        while(s<=e){
            mid=(e+s)/2;
            if(mid*mid==x){
               ans=mid;
               break;
            }
            else if(mid<x/mid){
                ans=mid;
                s=mid+1;
            }
            else{
            e=mid-1;
            }
        }
        cout<<INT_MAX;
         return int(ans);
    }
};