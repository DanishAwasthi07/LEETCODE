class Solution {
    public int minimumLength(String s) {
        char[]c= s.toCharArray();
         int i =0 ,j=c.length-1;
         while(i<j && c[i]==c[j]){
            char curr =c[i];
            while(i<=j && c[i]==curr){
                i++;
            }
            while(i<=j && c[j]==curr){
                j--;
            }
         }
         return j-i+1;
    }
}