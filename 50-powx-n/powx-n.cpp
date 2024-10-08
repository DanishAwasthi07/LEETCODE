class Solution {
public:
    double myPow(double x, long n) {
        double ans;
        if(n==0) return 1;
        else if(n==1) return x;
        else if(n<0){
            x=(double)1/x;
            n=-n;
        }
        ans= myPow(x,n/2);
        if((n%2)==0){
            return ans*ans;
        }
        else{
            return ans*ans*x;
        }
    }
};