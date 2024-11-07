class Solution {
    public int pivotIndex(int[] nums) {
       int total=0,leftsum=0;
       for(int i:nums) {
        total+=i;
        }
       for(int i=0;i<nums.length;i++){
         if(leftsum*2==total-nums[i]) {
            return i;}
         leftsum+=nums[i];
       }
       return -1;
    }
}