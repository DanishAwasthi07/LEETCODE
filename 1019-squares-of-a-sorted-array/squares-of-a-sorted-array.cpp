class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int>res(nums.size());
        for(int i=0;i<nums.size();i++){
            nums[i]= nums[i]*nums[i];
        }
        int s=0,e=nums.size()-1;
        for(int i=nums.size()-1;i>=0;i--){
            if(nums[s]>=nums[e]){
                res[i]=nums[s];
                s++;
            }
            else{
                res[i]=nums[e];
                e--;
            }
        }
        return res;
    }
};