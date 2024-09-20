class Solution {
    public boolean validPalindrome(String s) {
        char[]str = s.toCharArray();
        int n=str.length-1;
        int i=0,j=n;
        while(i<j){
            if(str[i]!=str[j]){
               return isPalli(str,i+1,j)||isPalli(str,i,j-1);
            }
            i++;
            j--;
        }
         return true;
    }
    public boolean isPalli(char[]s,int l,int r)
    {
        while(l<r){
            if(s[l]!=s[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}