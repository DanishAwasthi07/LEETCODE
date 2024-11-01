class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int MaxArea=0;
        while(left<right){
            int CurrArea= Math.min(height[left],height[right])*(right-left);
            MaxArea=Math.max(CurrArea,MaxArea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return MaxArea;
    }
}