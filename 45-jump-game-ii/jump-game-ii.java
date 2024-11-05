class Solution {
    public int jump(int[] nums) {
        int count=0;
        int endOfCurrJump=0;
        int MaxReach=0;
        for(int i=0;i<nums.length-1;i++){
            MaxReach=Math.max(MaxReach,nums[i]+i);
            if(i==endOfCurrJump){
                count++;
                endOfCurrJump=MaxReach;
                if(MaxReach>=nums.length-1) break;
            }
        }
        return count;
    }
}