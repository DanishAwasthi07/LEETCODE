// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int start=0,end=n,m;
        while(start<end){
            m=start+(end-start)/2;
            // int res= isBadVersion(m);
            // if(res==1 && (m==0 || isBadVersion(m-1)!=1)){
            //     return m;
            // }
            // else if(res==0){
            //     start=m+1;
            // }
            // else{
            //     end=m-1;
            // }
            if (isBadVersion(m)) {
                end = m;
            } else {
                start = m + 1;
            }
        }
        return start;
        }
        // return m;
};