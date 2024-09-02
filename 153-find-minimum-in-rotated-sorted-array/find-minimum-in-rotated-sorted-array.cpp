class Solution {
public:
    int findMin(vector<int>& nums) {
        // sort(nums.begin(),nums.end());
        // return nums[0];
        int s=0,e=nums.size()-1;
        int mid;
        while(s<e){
            mid=s+(e-s)/2;
            if(mid>0 && nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            else if(nums[mid]>nums[e]){
                s=mid+1;
            }
            else{
            e=mid-1;
            }
        }
        return nums[s];
    }
};