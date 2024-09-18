class Solution {
    public boolean checkRecord(String s) {
        int counta=0,countb=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='A'){
            counta++;
           }
        }
        for (int i = 0; i < s.length()-2; i++){
        if( s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L'){
                countb++;
            }
        }
        if(counta<2 && countb==0)return true;
        return false;
    }
};
