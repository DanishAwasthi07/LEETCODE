class Solution {
    public int countDigits(int num) {
        int count=0;int num1=num;
        while(num>0){
            int val=num%10;
            if(num1%val==0) count++;
            num=num/10;
        }
        return count;
    }
}