class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        for(int i=2;i<=Math.max(a,b);i++){
            if(a%i==0 && b%i==0) count++;
        }
        return count+1;
    }
}