class Solution {
    public String reverseStr(String s, int k) {
        char [] str = s.toCharArray();
        int n=str.length;
        for(int i=0;i<=n-1;i=i+2*k){
            if(i+k-1<n-1){
                reverse(i,i+k-1,str);
            }
            else{
                  reverse(i,n-1,str);
            }
        }
        String ans= new String(str);
        return ans;
    }
public void reverse(int l,int r,char[]s){
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
}
}