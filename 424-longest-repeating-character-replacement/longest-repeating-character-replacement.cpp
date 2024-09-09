class Solution {
public:
    int characterReplacement(string s, int k) {
    int sz= s.size(),ans=0;
    for(char c='A';c<='Z';c++){
        int i=0,j=0,replace=0;
        while(j<sz){
            if(s[j]==c) 
            j++;
            else if(replace<k) 
            j++,replace++;
            else if(s[i]==c) i++;
            else i++,replace--;
            ans=max(ans,j-i);
        }
    }
    return ans;
    }
};